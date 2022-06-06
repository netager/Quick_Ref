package sec03_udpcommunication.EX02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class DatagramSocketobject {
	public static void main(String[] args) {
		
		//#1. DatagramSocket 객체 생성 (모든 DatagramSocket은 바인딩 되어 있어야 한다)
		DatagramSocket ds1 = null;
		DatagramSocket ds2 = null;
		DatagramSocket ds3 = null;
		DatagramSocket ds4 = null;
		
		try {
			ds1 = new DatagramSocket(); //비어있는 포트로 자동 바인딩
			ds2 = new DatagramSocket(10000);
			
			ds3 = new DatagramSocket(10001, InetAddress.getByName("localhost"));
			ds4 = new DatagramSocket(new InetSocketAddress("localhost", 10002));
		} catch (SocketException | UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//#2. DatagramSocket 메서드
		//@2-1. 소켓의 바인딩 정보
		System.out.println("ds1의 바인딩 정보 : " + ds1.getLocalAddress()+":"+ds1.getLocalPort());
		System.out.println("ds2의 바인딩 정보 : " + ds2.getLocalAddress()+":"+ds2.getLocalPort());
		System.out.println("ds3의 바인딩 정보 : " + ds3.getLocalAddress()+":"+ds3.getLocalPort());
		System.out.println("ds4의 바인딩 정보 : " + ds4.getLocalAddress()+":"+ds4.getLocalPort());
		System.out.println("-------------------------------------------------");
		System.out.println();
		
		//@2-2. 원격지 정보 저장 (connect() 메서드 사용)
		System.out.println("원격지 주소 정보 : "+ds4.getInetAddress()+":"+ds4.getPort());
		
		try {
			ds4.connect(new InetSocketAddress("localhost", 10003));
		} catch (SocketException e) {
			e.printStackTrace();
		}
		System.out.println("ds4의 원격지 주소 정보 : "+ds4.getInetAddress()+":"+ds4.getPort());
		ds4.disconnect();
		System.out.println("-------------------------------------------------");
		System.out.println();

		//@2-3. send()/connect(), receive()
		//전송 데이터그램 패킷 생성
		byte[] data1 = "수신지 주소가 없는 데이터그램 패킷".getBytes();
		byte[] data2 = "수신지 주소가 있는 데이터그램 패킷".getBytes();
		
		DatagramPacket dp1 = new DatagramPacket(data1, data1.length);
		DatagramPacket dp2 = new DatagramPacket(data2, data2.length, new InetSocketAddress("localhost", 10002));
		
		try {
//			ds1.send(dp1);	//불가능 : 소켓은 연결(connect)된 정보 없음 + 패킷은 수신지 정보 없음
//			ds2.send(dp1);	//불가능 : 소켓은 연결(connect)된 정보 없음 + 패킷은 수신지 정보 없음
//			ds3.send(dp1);	//불가능 : 소켓은 연결(connect)된 정보 없음 + 패킷은 수신지 정보 없음

			ds1.connect(new InetSocketAddress("localhost", 10002));
			ds2.connect(new InetSocketAddress("localhost", 10002));
			ds3.connect(new InetSocketAddress("localhost", 10002));

			ds1.send(dp1);	//가능 : 소켓은 연결(connect)된 정보 있음 + 패킷은 수신지 정보 없음
			ds2.send(dp1);	//가능 : 소켓은 연결(connect)된 정보 있음 + 패킷은 수신지 정보 없음
			ds3.send(dp1);	//가능 : 소켓은 연결(connect)된 정보 있음 + 패킷은 수신지 정보 없음
			
			ds1.disconnect();
			ds2.disconnect();
			ds3.disconnect();
			System.out.println("-------------------------------------------------");
			System.out.println();
			
			ds1.send(dp2); //가능 : 소켓은 연결(connect)된 정보 없음 + 패킷은 수신지 정보 있음 : 바로 위에서 disconnect() 
			ds2.send(dp2); //가능 : 소켓은 연결(connect)된 정보 없음 + 패킷은 수신지 정보 있음
			ds3.send(dp2); //가능 : 소켓은 연결(connect)된 정보 없음 + 패킷은 수신지 정보 있음
			
			ds3.connect(new InetSocketAddress("localhost", 10002));
			ds3.send(dp2);	//가능 : 소켓은 연결(connect)된 정보 있음 + 패킷은 수신지 정보 있음 : 두 주소 일치
			ds3.disconnect();
			System.out.println("-------------------------------------------------");
			System.out.println();

//			ds3.connect(new InetSocketAddress("localhost", 10003));
//			ds3.send(dp2);	//가능 : 소켓은 연결(connect)된 정보 있음 + 패킷은 수신지 정보 있음 : 두 주소 불일치 : IllegalArgumentException
//			ds3.disconnect();
//			System.out.println("-------------------------------------------------");
//			System.out.println();
			
			//@ 데이터 수신
			byte[] receivedData = new byte[65508];	//받을 수 있는 최대 바이트
			DatagramPacket dp = new DatagramPacket(receivedData, receivedData.length);
			
			for (int i=0; i<7; i++) {
				ds4.receive(dp);
				System.out.print("["+i+"] 송신자 정보 : " + dp.getAddress() + ":" + dp.getPort());
				System.out.println(" : "+ new String(dp.getData()).trim());
			}
			System.out.println("-------------------------------------------------");
			System.out.println();
			
			//@송수신 데이터 버퍼
			System.out.println("송신버퍼 크기 : " + ds1.getSendBufferSize());
			System.out.println("수신버퍼 크기 : " + ds1.getReceiveBufferSize());
		} catch (IOException e) {e.printStackTrace();}


		
	}

}
