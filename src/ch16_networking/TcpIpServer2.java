package ch16_networking;

import java.net.*;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class TcpIpServer2 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println(getTime() + " Server is ready.");
		} catch (IOException e) {
			e.printStackTrace();
		}

		while (true) {
			try {
				System.out.println(getTime() + " Waiting for connection requests.");
				Socket socket = serverSocket.accept();
				System.out.println(getTime() + " Connection request from " + socket.getInetAddress());
				System.out.println("Port: " + socket.getPort());
				System.out.println("LocalPort: " + socket.getLocalPort());

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
