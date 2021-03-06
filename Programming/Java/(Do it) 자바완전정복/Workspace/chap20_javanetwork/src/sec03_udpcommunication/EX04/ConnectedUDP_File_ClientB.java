package sec03_udpcommunication.EX04;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class ConnectedUDP_File_ClientB {
	public static void main(String[] args) {
		
		System.out.println("<<<ClientB>> - File");
		
		//#1. DatagramSocket 생성(binding 포함)
		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket(20000);
			ds.connect(new InetSocketAddress("localhost", 10000));
		} catch (SocketException e) {e.printStackTrace();}
		
		//#2. 데이터그램 패킷 수신 
		byte[] receivedData = null;
		DatagramPacket receivedPacket = null;
		
		//@2-1. 파일이름 수신
		receivedData = new byte[65508];
		receivedPacket = new DatagramPacket(receivedData, receivedData.length);
		
		try {
			ds.receive(receivedPacket);
		} catch (IOException e) {e.printStackTrace();}
		
		String fileName = new String(receivedPacket.getData(), receivedPacket.getOffset(), receivedPacket.getLength());
		File file = new File("src/sec03_udpcommunication/files_clientB/"+fileName);
		BufferedOutputStream bos = null;
		try {
			bos = new BufferedOutputStream(new FileOutputStream(file));
		} catch (FileNotFoundException e) {e.printStackTrace();}
		System.out.println("수신파일이름: "+fileName);
		
		
		//@2-2. 시작태그와 끝태그를 기준으로 파일 수신 
		String startSign = "/start";
		String endSign = "/end";

		receivedData = new byte[65508];
		receivedPacket = new DatagramPacket(receivedData, receivedData.length);
		int sumSize = 0;
		try {
			ds.receive(receivedPacket);
			if (new String(receivedPacket.getData(), receivedPacket.getOffset(), receivedPacket.getLength()).equals(startSign)) {
				System.out.println("while loop before");
				while(true) {
					ds.receive(receivedPacket);
					sumSize += receivedPacket.getLength();
					System.out.println("파일 용량 합계 : "+sumSize+ "   받은 용량 :" + receivedPacket.getLength());
//					System.out.println(new String(receivedPacket.getData(), receivedPacket.getOffset(), receivedPacket.getLength()));
					if (new String(receivedPacket.getData(), receivedPacket.getOffset(), receivedPacket.getLength()).equals(endSign))
						break;
					bos.write(receivedPacket.getData(), receivedPacket.getOffset(), receivedPacket.getLength());
					bos.flush();
					
				}
			bos.close();
			}
		} catch (IOException e) {e.printStackTrace();}


		//#4. 파일 전송 완료 메세지 응답
		byte[] sendData = "파일 수신 완료".getBytes();
		DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length);
		
		try {
			ds.send(sendPacket);
		} catch (IOException e) {e.printStackTrace();}
				
	}
}
