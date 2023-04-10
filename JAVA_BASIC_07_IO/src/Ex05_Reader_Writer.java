import java.io.FileReader;
import java.io.FileWriter;

/*
문자기반의 데이터 다루기 (char[])
String 클래스 >> 내부적으로 char[] 관리

Reader, Writer (추상클래스)

파일)
FileReader, FileWriter

 */
public class Ex05_Reader_Writer {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("Ex01_Stream.java"); //read
			fw = new FileWriter("copy_Ex01.txt"); // 경로에 파일이 없으면 create 한다 
			
			int data = 0;
			while ((data = fr.read()) != -1) {
				//System.out.println(data);
				//fw.write(data);
				if (data != '\n' && data != '\r' && data != '\t' && data != ' ') {
					fw.write(data);
					// 엔터, 탭, 빈문자, 커서 맨앞 이동은 파일에 쓰지 않겠다 
					// 압축버전
					//https://jquery.com/download/ 압축버전 다운로드 ...
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fw.close();
				fr.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
