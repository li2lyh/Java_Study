package ch15_io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class BufferedOutputStreamEx1 {
	public static void main(String args[]) {
		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			for (int i = '1'; i <= '9'; i++) {
				bos.write(i);
			}
			bos.close(); // bos.close() 사용하면 12345, bos에 있는 내용이 버퍼에 남아있기 때문
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
