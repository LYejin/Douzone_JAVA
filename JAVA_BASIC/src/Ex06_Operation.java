
public class Ex06_Operation {

	public static void main(String[] args) {
		//대입 연산자 
		// +=, -=, *=, /=
		
		int sum = 10;
		sum += 1; // sum = sum + 1;
		sum -= 1; // sum = sum - 1;
		System.out.println("sum : " + sum);
		
		/*
		 if (조건식) {}
		 
		 if (조건식) {} else {}
		 
		 if (조건식) {} else if () {} else if ... else {}
		 
		 간단한 학점 계산기
		 
		 학점 : A+, A-, B+, B-, ...F
		 
		 판단기준: 90점 이상 이고 95점 이상 이면
		 //90 이상A 80이상B 70이상C 나머지 F 
		 
		 */
		int score = 78;
		String grade= ""; // A+ or A- or B+ ....
		
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else {
			grade = "F";
		}
		
		if (grade != "F") {
			grade += ((score%10) > 5) ? "+" : "-";
		}
		System.out.println("당신의 학점 : " + grade);
		
		
		
		for (char i='A'; i<='Z'; i++) {
			System.out.println(i);
		}
		
		for (int i=65; i<=90; i++) {
			System.out.println((char) i + " ");
		}
		System.out.println();
		
		for (int i=1; i<=100; i++) {
			System.out.print(i +" ");
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		
		// 입사시험 (가장 많이 나오는 문제)
		// 힌트) 제어문 (반복문)
		// 구구단 (행 열 개념)
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + "*" + j + " = " + i*j);
				System.out.printf("%d*%d=%d\t", i,j,i*j);
			}
			System.out.println();
		}
	}

}
