import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03_Stream_ImageCopy {

	public static void main(String[] args) {
		String oriFile = "/Users/yejin/Documents/test-project/temp/1.jpeg";
		String targetFile = "copy.jpeg";
		//default 경로 :
		//JAVA_BASIC_07_IO 폴더가 default 경로가 되네요
		FileInputStream fs = null;
		FileOutputStream fos = null;
		
		try {
			fs = new FileInputStream(oriFile);
			fos = new FileOutputStream(targetFile);
			
			int data = 0;
			while (( data = fs.read()) != -1) {
				fos.write(data); // byte값
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fs.close();
				fos.close();
			} catch (Exception e2) {
				
			}
		}

	}

}
