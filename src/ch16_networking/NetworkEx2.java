package ch16_networking;

import java.net.*;

class NetworkEx2 {
	public static void main(String args[]) throws Exception {
		URL url = new URL("http://sleepyeyes.tistory.com/admin/entry/post/?type=post&returnURL=/manage/posts/");

		System.out.println("url.getAuthority() : " + url.getAuthority());
		System.out.println("url.getDefaultPort() : " + url.getDefaultPort());
		System.out.println("url.getPort() : " + url.getPort());
		System.out.println("url.getFile() : " + url.getFile());
		System.out.println("url.getHost() : " + url.getHost());
		System.out.println("url.getPath() : " + url.getPath());
		System.out.println("url.getProtocol() : " + url.getProtocol());
		System.out.println("url.getQuery() : " + url.getQuery());
		System.out.println("url.getRef() : " + url.getRef());
		System.out.println("url.getUserInfo() : " + url.getUserInfo());
		System.out.println("url.toURI() : " + url.toURI());
	}
}