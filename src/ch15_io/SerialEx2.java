package ch15_io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class SerialEx2 {
	public static void main(String[] args) {
		try {
			String fileName = "UserInfo.ser";
			FileInputStream fis = new FileInputStream(fileName);
			BufferedInputStream bis = new BufferedInputStream(fis);

			ObjectInputStream in = new ObjectInputStream(bis);

			// 객체를 읽을 때는 출력한 순서와 일치해야함
			// 그렇기 때문에 직렬화할 객체가 많을 때는 각 객체를 개별적으로 직렬화 하는 것 보다는 
			// List같은 컬렉션에 저장해서 직렬화하는 것이 간단함
			// 그러면 List 하나만 역직렬화하면 되기 때문에 순서를 고려하지 않아도 되기 때문
			UserInfo u1 = (UserInfo) in.readObject();
			UserInfo u2 = (UserInfo) in.readObject();
			ArrayList list = (ArrayList) in.readObject();

			System.out.println(u1);
			System.out.println(u2);
			System.out.println(list);
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}