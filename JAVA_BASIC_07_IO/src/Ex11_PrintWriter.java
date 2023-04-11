import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
출력 형식을 지정 보조 스트림
1. printf
2. String.format
3. I/O PrintWriter (파일에 출력 정의(이쁘게))

 현업) 세금계산서, 지출결의서 출력, 휴가서, 품의서 >> 만들어주는 >> 레포팅 >> 오즈, 크리스탈 레포트


 */
public class Ex11_PrintWriter {
	public static void main(String[] args) throws IOException {
		FileReader fr = null; // finally에서 받기 위해서 
		BufferedReader br = null;
		
		try {
			/*
			PrintWriter pw = new PrintWriter("/Users/yejin/Documents/test-project/temp/homework.txt");
			pw.println("******************");
			pw.println("*****HOMEWORK*****");
			pw.printf("%3s : %5d %5d %5d %5.1f","아무개", 100, 88, 90, (float) ((100+88+90)/3));
			pw.println();
			pw.close();
			*/
			
			// read (Line단위) 문자
			fr = new FileReader("/Users/yejin/Documents/test-project/temp/homework.txt");
			br = new BufferedReader(fr);
			String s = "";
			while ((s=br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			br.close();
			fr.close();
		}
	}

}
