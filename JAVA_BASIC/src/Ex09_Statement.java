
public class Ex09_Statement {

	public static void main(String[] args) {
		/*
		
		 제어문
		 조건문 : if (3가지), switch(조건), {case 값 ...break}
		 반복문 : for(반복횟수가 명) {}, while(진위-> 반복횟수 명확하지 않음) {}, do{} ~ while()
		 분기문 : break(블럭탈출), continue(아래 구문은 skip)
		 */
		int count = 0;
		// 단일 if 
		if (count < 1) System.out.println("true"); // 단일 if {} 생략 가능 
		
		//
		if (count < 1) {
			System.out.println("{ true }");
		}
		
		char data = 'A'; // char는 무조건 ""이 아니라 ''로 해야한다
		switch(data) {
			case 'A' : System.out.println("문자 비교 같아요"); break;
			case 'B' : System.out.println("B입니당"); break;
			default : System.out.println("나머지 처리");
		}
		
		// for문
		// 1~100까지 합
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			//System.out.println(i);
			sum += i;
		}
		System.out.printf("1~100까지 누적 합 : %d \n", sum);
		
		// 1~5까지의 합
		sum = 5 * (1 + 5) / 2; //수식 : n*(1+n)/2
		System.out.println("sum : " + sum);
		
		// 1 ~ 10까지의 홀수 합
		int num = 1;
		sum = num;
		for (int i=1; i<=4; i++) {
			num += 2;
			sum += num;
		}
		System.out.println(sum);
		
		
		int sum2 = 0;
		for (int i=1; i<=10; i+=2) { // i=i+2
			sum2+=i;
		}
		System.out.println("sum2 : " + sum2);
		
		int sum3 = 0;
		// for문에서 if문 사용해서 1~1000까지 짝수의 합을 구하세요
		for (int i=2; i<=1000; i+=2) { 
			sum3 += i;
		}
		System.out.println("sum3 : " + sum3);
		
		int sum4 = 0;
		// for문에서 if문 사용해서 1~1000까지 짝수의 합을 구하세요
		for (int i=1; i<=1000; i++) { 
			if (i%2 == 0) {
				sum4 += i;
			}
		}
		System.out.println("sum4 : " + sum4);
		
		// 별찍기
		for (int i=1; i<=5; i++) { // 기본문제 
			for (int j=i; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i=5; i>=1; i--) {
			for (int z=1; z<i; z++) {
				System.out.print(" ");
			} 
			for (int j=1; j<=6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i=0; i<5; i++) {
			for (int j=0; j < i; j++) {
				System.out.print(" ");
			}
			for (int z=5; z > i; z--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		// 함수 안이다 
		// 초급자 구구단 못하면 ...ㅠㅠ
		for (int i=1; i<=9; i++) { // 블럭변수 i scope
			for (int j=1; j<=9; j++) { // 여기에 i 못 씀
				System.out.printf("%d * %d = %d \n", i,j,i*j);
			}
		}
		
		// for문 + 분기문 (continue, break)
		// 초급자 Today Point(continue(아래 구문 skip), break (for, while 블럭 탈출)
		
		for (int i=2; i<=9; i++) { // 블럭변수 i scope
			for (int j=1; j<i; j++) { // 여기에 i 못 씀 // 배열에서 정렬알고리즘 bubble ...
				if (i == j) {
					continue; // for 블럭 탈출
				}
				System.out.printf("%s", "*");
			}
			System.out.println();
		}
		
		// 100부터 0까지의 출력 (시작값 100)
		for (int i = 100; i >= 0; i--) {
			System.out.println(i);
		}
		
		// 초급자가 아닌 분들
		// 피보나치 수열 제어문으로 구현하기
		int a=0, b=1, c=0;
		for (int i=0; i<10; i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.printf("%d * %d = %d \t", a,b,c);
			System.out.println(" " + c);
		}
		
	}

}
