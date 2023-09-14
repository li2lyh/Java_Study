package ch15_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InputStreamReaderEx {
	public static void main(String args[]) {
		String line = "";
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			System.out.println("사용중인 OS의 인코딩:" + isr.getEncoding());

			do {
				System.out.println("문장을 입력하세요. 마치시려면 q를 입력하세요.>");
				line = br.readLine();
				System.out.println("q");
			} while (!line.equalsIgnoreCase("q"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
