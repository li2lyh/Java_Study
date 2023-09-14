package ch16_networking;

import java.io.*;
import java.net.*;

public class NetworkEx4 {
	public static void main(String[] args) {
		URL url = null;
		BufferedReader input = null;
		String address = "http://www.javahome.com/sample/hello.html";
		String line = "";

		try {
			url = new URL(address);
			input = new BufferedReader(new InputStreamReader(url.openStream()));

			while ((line = input.readLine()) != null) {
				System.out.println(line);
			}
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}