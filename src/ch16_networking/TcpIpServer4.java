package ch16_networking;

import java.net.*;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class TcpIpServer4 implements Runnable {
	ServerSocket serverSocket;
	Thread[] threadArr;

	public static void main(String[] args) {
		TcpIpServer4 server = new TcpIpServer4(5);
		server.start();
	}

	public TcpIpServer4(int num) {
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println(getTime() + " Server is ready.");
			threadArr = new Thread[num];
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void start() {
		for (int i = 0; i < threadArr.length; i++) {
			threadArr[i] = new Thread(this);
			threadArr[i].start();
		}
	}

	public void run() {
		while (true) {
			try {
				System.out.println(getTime() + " Waiting for connection requests.");
				Socket socket = serverSocket.accept();
				System.out.println(getTime() + " Connection request from " + socket.getInetAddress());

				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				dos.writeUTF("[Notice] Test Message1 from Server.");
				System.out.println(getTime() + " Data sent.");

				dos.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
}
