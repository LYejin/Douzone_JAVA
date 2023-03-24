import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //숫자로도 받을 수 있음 
		int[] student = new int[31]; // 1~30명 
		int[] studentNo = new int[31]; // 1~30명 
		int num = 0;
		
		for (int i=0; i<28; i++) {
			student[Integer.parseInt(br.readLine())] = 1;
		}
		
		for (int j=0; j<student.length; j++) {
			if (student[j] != 1) {
				studentNo[num] = j;
				num++;
			}
		}
		
		Arrays.sort(studentNo);

        for (int i = 0; i < studentNo.length; i++) {
        	if (studentNo[i] != 0) {
                System.out.println(studentNo[i]);
			}
        }
		
		
	}

}
