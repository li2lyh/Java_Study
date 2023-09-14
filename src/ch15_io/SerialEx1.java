package ch15_io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerialEx1 {
	public static void main(String[] args) {
		try {
			String fileName = "UserInfo.ser";
			FileOutputStream fos = new FileOutputStream(fileName);
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			ObjectOutputStream out = new ObjectOutputStream(bos);

			UserInfo u1 = new UserInfo("javaMan", "1234", 30);
			UserInfo u2 = new UserInfo("javaWoman", "4321", 29);

			ArrayList<UserInfo> list = new ArrayList<>();
			list.add(u1);
			list.add(u2);

			// 객체 직렬화
			out.writeObject(u1);
			out.writeObject(u2);
			out.writeObject(list);
			out.close();
			System.out.println("직렬화가 잘 끝났습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
