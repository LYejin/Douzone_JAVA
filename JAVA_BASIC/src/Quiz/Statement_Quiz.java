package Quiz;

public class Statement_Quiz {

	public static void main(String[] args) {
		// 초급자 제어문 문제
		// 1번
		for (int i=0; i<26; i++) {
			System.out.print((char)('A'+i));
		}
		
		
		System.out.println();
		
		//2번
		for (int z=1; z<=100; z++) {
			System.out.print(" " + z);
			if (z%10 == 0) {
				System.out.println();
			}
		}
		
		
		//3번
		System.out.print("경우의 수 : ");
		int num1 = 0;
		int num2 = 0;
		for (int j=1; j<6; j++) {
			System.out.printf("(%d, %d) ", j, 6-j);
		}

	}

}
