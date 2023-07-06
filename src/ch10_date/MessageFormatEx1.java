package ch10_date;

import java.text.*;

public class MessageFormatEx1 {
	public static void main(String[] args) {
		String msg = "Name : {0} \nTel: {1} \nAGE: {2} \nBirthday: {3}";

		Object[] argurmnets = { "이자바", "02-123-1234", "27", "07-09" };

		String result = MessageFormat.format(msg, argurmnets);
		System.out.println(result);
	}
}
