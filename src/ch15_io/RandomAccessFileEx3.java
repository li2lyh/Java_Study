package ch15_io;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx3 {
	public static void main(String[] args) {
		int sum = 0;

		try {

			RandomAccessFile raf = new RandomAccessFile("test.dat", "rw");
			int i = 4;

			while (true) {
				raf.seek(i);
				sum += raf.readInt();
				i += 16;
			}
		} catch (EOFException e) {
			System.out.println("sum: " + sum);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
