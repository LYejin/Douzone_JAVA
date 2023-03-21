import java.util.Scanner;

public class Ex08_Operation_Quiz {

	public static void main(String[] args) {
		/*
		 간단한 사칙 연산기 (+, -, *, /)
		 입력값 3개 (입력값은 nextLine() 받아서 필요하다면 숫자 변환)
		 목적: Integer.parseInt(), ** 구글 java equals() 활용 문자열의 비교 **
		 
		 화면
		 >입력값: 숫자
		 >입력값(기호): +
		 >입력값: 숫자
		 >연산결과: 200
		 
		 -----------
		ex)
		 >입력값: 100
		 >입력값(기호): -
		 >입력값: 100
		 >연산결과: 0
		 
		 hint)
		 ■ if문은 조건값이 boolean형, 

		 ■ switch문은 정수형(byte, short, int)과 문자형(char), 문자열(String)

		 ■ long, boolean, float, double형 사용 불가
		 
		 ** 문자열의 비교는 == 을 쓰지 않아요**
		 why) 지금알면 아프다.
		String str = "+"; 이런 값이 있다
		if(str.equals("*")) 하시면 됩니다.
		
		답은 String 클래스 별도 학습 할 때 이유에 대한 답은 ...
		 
		 */
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력해주세요 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("연산자를 입력해주세요(+, -, *, / 중에서) : ");
		String operation = sc.nextLine();
		System.out.print("두번째 숫자를 입력해주세요 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		switch (operation) {
			case "+" : result = num1 + num2; break;
			case "-" : result = num1 - num2; break;
			case "*" : result = num1 * num2; break;
			case "/" : result = num1 / num2; break;
			default : System.out.println("연산자를 잘못 입력하셨습니다.");
		}
		
		if (result != 0) {
			System.out.println("연산된 결과값은 : " + result);
		}
		
		
	}

}
