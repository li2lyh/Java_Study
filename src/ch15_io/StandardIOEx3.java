package ch15_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

class StandardIOEx3 {
	public static void main(String[] args) {

		PrintStream ps = null;
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream("test.txt");
			ps = new PrintStream(fos);
			System.setOut(ps); // System.out의 출력대상을 test.txt 파일로 변경

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("Hello by System.out");
		System.err.println("Hello by System.err");

	}
}