package ch16_networking;

import java.net.*;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class TcpIpServer {
	public static void main(String args[]) {
		ServerSocket serverSocket = null;

		try {
			// 서버소켓을 생성하여 7777번 포트와 결합(bind)시킴
			serverSocket = new ServerSocket(7777);
			System.out.println(getTime() + "서버가 준비되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}

		while (true) {
			try {
				System.out.println(getTime() + "연결요청을 기다립니다.");
				// 서버소켓은 클라이언트의 연결요청이 올 때까지 실행을 멈추고 계속 기다림
				// 클라이언트의 연결요청이 오면 클라이언트 소켓과 통신할 새로운 소켓을 생성
				Socket socket = serverSocket.accept();
				System.out.println(getTime() + socket.getInetAddress() + "로부터 연결요청이 들어왔습니다.");

				// 소켓의 출력스트림을 얻음
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);

				// 원격소켓(remote socket)에 데이터를 보냄
				dos.writeUTF("[Notice] Test Message1 from Server.");
				System.out.println(getTime() + "데이터를 전송했습니다.");

				// 스트림과 소켓을 닫아줌
				dos.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// 현재시간을 문자열로 받환하는 함수
	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
}