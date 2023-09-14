package ch15_io;

import java.io.File;

class FileEx8 {
	static int deleteFiles = 0;
	
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("USAGE : java FileEx8 Extension");
			System.exit(0);
		}
		
		String currDir = System.getProperty("user.dir");
		currDir = "c:\\logs";

		File dir = new File(currDir);
		final String ext = ".bak";
		delete(dir, ext);
		System.out.println(deleteFiles + " 개의 파일이 삭제 되었습니다.");
	}

	private static void delete(File dir, String ext) {
		File[] files = dir.listFiles();
		
		for(int i = 0; i < files.length; i++){
			if(files[i].isDirectory()){
				delete(files[i], ext);
			}else{
				String filename = files[i].getAbsolutePath();
				
				if(filename.endsWith(ext)){
					System.out.print(filename);
					if(files[i].delete()){
						System.out.println("-삭제 성공");
						deleteFiles++;
					}else{
						System.out.println("-삭제 실패");
					}
				}				
			}
		}		
	}		
}