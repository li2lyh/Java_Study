package ch15_io;

import java.io.File;

class FileEx9 {
	public static void main(String[] args) {
		if (args.length != 0) {
			System.out.println("USAGE : java FileEx9 DIRECTORY");
			System.exit(0);
		}
		
		File dir = new File(args[0]);
		if(!dir.exists() || !dir.isDirectory()){
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}
		
		File[] files = dir.listFiles();
		for(int i = 0; i < files.length; i++){
			String fileName = files[i].getName();
			//파일명
			System.out.println("파일이름 :" + fileName);
			String newFileName = "0000" + fileName;
			newFileName = newFileName.substring(newFileName.length() - 7);
			System.out.println("변경된 파일 이름 : " + newFileName );
			files[i].renameTo(new File(dir, newFileName));
		}
	}		
}