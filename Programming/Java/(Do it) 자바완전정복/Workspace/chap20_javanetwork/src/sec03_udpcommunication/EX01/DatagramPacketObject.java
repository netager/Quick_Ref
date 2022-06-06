package sec03_udpcommunication.EX01;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class DatagramPacketObject {
	public static void main(String[] args) {
		
		//#1. 데이터 생성 (byte[] : 65536 bytes(64Kbytes) - 20byte(IP 헤더) - 8byte(UDP 헤더) = 65508bytes
		byte[] buf = "UDP-데이터그램패킷".getBytes(); 	//Default Charset 사용됨
		
		//#2. DatagramPacket 객체 생성
		//@2-1. 수신지 주소 미포함 패킷
		DatagramPacket dp1 = new DatagramPacket(buf, buf.length);
		DatagramPacket dp2 = new DatagramPacket(buf, 4, buf.length-4);
		
		//#2. DatagramPacket 객체 생성
		//@2-2. 수신지 정보(IP, Port) 포함 패킷
		DatagramPacket dp3 = null;
		DatagramPacket dp4 = null;
		try {
			dp3 = new DatagramPacket(buf, buf.length, InetAddress.getByName("localhost"), 10000);
			dp4 = new DatagramPacket(buf, 4, buf.length-4, InetAddress.getByName("localhost"), 10000);
		} catch (UnknownHostException e) {e.printStackTrace();}

		//@2-3 수신지 정보(IP, Port) 포함 패킷
		DatagramPacket dp5 = new DatagramPacket(buf, buf.length, new InetSocketAddress("localhost", 10000));
		DatagramPacket dp6 = new DatagramPacket(buf, 4, buf.length-4, new InetSocketAddress("localhost", 10000));
		
		//#3. DatagramPacket method
		System.out.println("원격지 IP   : " + dp1.getAddress());		//null
		System.out.println("원격지 Port : " + dp1.getPort());				// 0
		System.out.println("원격지 IP   : " + dp1.getSocketAddress());	//IllegalArgumentException 예외 발생(???)
		System.out.println("----------------------------------------------------------");
		System.out.println();

		System.out.println("원격지 IP   : " + dp3.getAddress());		//
		System.out.println("원격지 Port : " + dp3.getPort());				// 0
		System.out.println("원격지 IP   : " + dp3.getSocketAddress());	//
		System.out.println("----------------------------------------------------------");
		System.out.println();

		System.out.println("포함데이터 : " + new String(dp1.getData()));	// buf
		System.out.println("포함데이터 : " + new String(dp2.getData()));	// buf, offset과 length의 용도를 생각해 보자
		System.out.println("포함데이터 : " + new String(dp2.getData(), dp2.getOffset(), dp2.getLength()));
		System.out.println("----------------------------------------------------------");
		System.out.println();
		
		dp1.setData("안녕하세요".getBytes());
		System.out.println("포함데이터 : " + new String(dp1.getData()));	// 
		
		
	}

}
