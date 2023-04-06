import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   
        
		int N = Integer.parseInt(br.readLine());
        
		int[] arr = new int[N]; 
        
		StringTokenizer st = new StringTokenizer(br.readLine());        
		for(int i = 0; i < N; i++){
			arr[i] = Integer.parseInt(st.nextToken()); // 두번째 줄 값 받기 
		}
        
		int x = Integer.parseInt(br.readLine()); // x 값 받기 
        
		Arrays.sort(arr);
        
		int start = 0;
		int end = N - 1;
		int sum = 0;
		int result = 0;
       
		while(start < end) { // i는 j보다 작아야 된다. 
			sum = arr[start] + arr[end];
			if(sum == x) result++;
            
			if(sum <= x) { // 같은 값이여도 증가
				start++; 
			} else { 
				end--;
			}
		}
        
		bw.write(result + "\n");
        
		bw.flush(); // 버퍼를 비워내는 동시에 출력 
		br.close(); // 스트림 닫기 
		bw.close(); // 스트림 닫기 

    }
}
