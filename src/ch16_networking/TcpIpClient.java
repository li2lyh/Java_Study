package ch16_networking;

import java.net.*;
import java.io.*;

public class TcpIpClient {
	public static void main(String args[]) {
		try {
			String serverIp = "127.0.0.1";

			System.out.println("서버에 연결중입니다. 서버IP :" + serverIp);
			// 소켓을 생성하여 연결을 요청
			// 연결하고자 하는 서버의 ip와 포트번호를 알아야함
			Socket socket = new Socket(serverIp, 7777);

			// 소켓의 입력스트림을 얻음
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);

			// 소켓으로 부터 받은 데이터를 출력
			System.out.println("서버로부터 받은 메시지:" + dis.readUTF());
			System.out.println("연결을 종료합니다.");

			// 스트림과 소켓을 닫음
			dis.close();
			socket.close();
			System.out.println("연결이 종료되었습니다.");
		} catch (ConnectException ce) {
			ce.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}