package ch15_io;

import java.io.BufferedReader;
import java.io.FileReader;

class BufferedReaderEx1 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("BufferedReaderEx1.java");
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			for(int i=1;(line = br.readLine())!=null;i++) {
				// ;를 포함한 라인을 출력
				if(line.indexOf(";")!=-1)
					System.out.println(i+":"+line);
			}
			br.close();
		} catch(Exception e) {}
	}
}
