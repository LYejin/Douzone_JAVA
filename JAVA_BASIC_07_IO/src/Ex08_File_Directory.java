import java.io.File;

public class Ex08_File_Directory {

	public static void main(String[] args) {
		//System.out.println(args[0]);
		if(args.length != 1) { // 방법을 ...
			System.out.println("사용법 : java 파일명 [디렉토리명]");
			System.exit(0); // 강제 종료 
		}
		
		//java   Ex08_File_Dir   C:\\Temp
		
		File f = new File(args[0]); // File("C:\\")
		if (!f.exists() || !f.isDirectory()) {
			// 존재하지 않거나 또는 디렉토리가 아니라면 
			System.out.println("유효하지 않은 경로입니다");
			System.exit(0);
		}
		
		// 실제 존재하는 경로이고 ... 폴더라면
		// POINT
		File[] files = f.listFiles();
		//[1.jpeg][2.jpeg][a.txt][file.txt][new.txt][기러기]
		System.out.println(files.length);
		for (int i=0; i<files.length; i++) {
			String name = files[i].getName(); // 파일명 or 폴더명 
			System.out.println(files[i].isDirectory() ? "[DIR]" + name : name);
		}
	}
}
