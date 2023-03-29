import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
class Solution {
	static int AnswerN;
	static int N = 10;

	public static void main(String args[]) throws Exception {
		//System.setIn(new FileInputStream("C:\sample_input.txt"));
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++) {
			N = Integer.parseInt(br.readLine());
			
			String[][] charr = new String[N][N]; // 바둑판 
			
			int xIndexRow = 0;
			int xIndexCol =0;
			int totalSum = 0;
			
			//N*N칸 돌면서 채워주기!! x값 나오면 index값 받아두기!!!
			
			for (int i=0; i<N; i++) { // 바둑판 초기화 
				String str = br.readLine().replace(" ", "");
				for (int j=0; j<str.length(); j++) {
					charr[i][j] = String.valueOf(str.charAt(j));
					if (str.charAt(j) == 'X') { // x의 위치값 받음 
						xIndexRow = i;
						xIndexCol = j;
					}
				}
			}
			
			// case1 행으로 찾아보기 xIndexRow
			int sum1 = 0;
			
			int HCountX = 0;
			int HCountXSum =0;
			int HCountY = 0;
			int HCountYSum = 0;
			int xIndex = 0;
			String[] case1 = charr[xIndexRow]; // 행 라인 받아오기
			String case1StringArr = Arrays.toString(case1).replace(",", "").replace(" ", "").replace("[", "").replace("]", "");
			xIndex = case1StringArr.indexOf("X");
			String[] case1FirstArr = case1StringArr.substring(0, xIndex).split("");
			String[] case1LastArr = case1StringArr.substring(xIndex+1).split("");
			
			
			
			// 앞부분 검사 
			for (int i=0; i< case1FirstArr.length; i++) {
				if (case1FirstArr[i].equals("H")) {
					HCountX += 1;
				}
				if (HCountX == 1 && case1FirstArr[i].equals("L")) {
					HCountX = 0;
				}
				if (HCountX == 2) {
					HCountXSum += 1;
				}
				if (case1FirstArr[i].equals("Y")) {
					HCountX = 0;
				}
			}
			
			// 뒷부분 검사
			for (int i=0; i< case1LastArr.length; i++) {
				if (case1LastArr[i].equals("Y")) {
					break;
				}
				if (case1LastArr[i].equals("H")) {
					HCountY += 1;
				}
				if (HCountY ==1 && case1LastArr[i].equals("L")) {
					HCountY = 0;
				}
				if (HCountY == 2) {
					HCountYSum += 1;
				}
			}
			// case2 열로 찾아보기 xIndexCol
			int HCountXC = 0;
			int HCountXCSum =0;
			int HCountYC = 0;
			int HCountYCSum =0;
			
			int yIndex = 0;
			String case2 = ""; //  라인 받아오기
			for (int i=0; i<N; i++) {
				case2 += charr[i][xIndexCol];
			}
			case2 = case2.replace("[", "").replace("]", "");
			yIndex = case1StringArr.indexOf("X");
			String[] case2FirstArr = case2.substring(0, yIndex).split("");
			String[] case2LastArr = case2.substring(yIndex+2).split("");
			
			// 앞부분 검사 
			for (int i=0; i< case2FirstArr.length; i++) {
				if (case2FirstArr[i].equals("H")) {
					HCountXC += 1;
				}
				if (HCountXC == 1 && case2FirstArr[i].equals("L")) {
					HCountXC = 0;
				}
				if (HCountXC == 2) {
					HCountXCSum += 1;
				}
				if (case2FirstArr[i].equals("Y")) {
					HCountXC = 0;
				}
			}
			// 뒷부분 검사
			for (int i=0; i< case2LastArr.length; i++) {
				if (case2LastArr[i].equals("Y")) {
					break;
				}
				if (case2LastArr[i].equals("H")) {
					HCountYC += 1;
				}
				if (HCountY ==1 && case2LastArr[i].equals("L")) {
					HCountYC = 0;
				}
				if (HCountYC == 2) {
					HCountYCSum += 1;
				}
			}
			AnswerN = HCountXSum + HCountYSum + HCountXCSum + HCountYCSum;
			System.out.println("#"+test_case+" "+AnswerN);
		}
	}
}