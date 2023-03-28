import java.util.Scanner;

public class Ex07_String_Total_Quiz {
	//1. 자리수 체크 (기능)함수 (14 ok)  return true , false 
	public static boolean totalNumberCheck(String str) {
		return (str.length() == 14) ? true : false;
	}
	
	//2. 뒷번호 첫번째 자리값 1~4까지의 값만 허용 기능함수  return true, false	
	public static boolean backFirstNumberCheck(int num) {
		return (num >=1 && num<=4) ?  true : false;
	}
	
	//3. 뒷번호 첫번째 자리값을 가지고 1,3 남자 , 2,4 여자 출력 기능함수 void 출력
	public static void backFirstNumberWMCheck(int num) {
		if (num == 1 || num ==3) {
			System.out.println("남자입니다.");
		} else if (num == 2 || num == 4){
			System.out.println("여자입니다.");
		} else {
			System.out.println("여자도 남자도 아닙니다.");
		}
	}
	
	
	public static void main(String[] args) {
		//주민번호 : 뒷번호 첫자리 : 1,3 남자 , 2,4 여자 라고 출력 ... 하는 문제
		// 123456-2234567
		Scanner sc = new Scanner(System.in);
		String jumin = sc.nextLine();
		
		//1)
		if (totalNumberCheck(jumin)) {
			System.out.println("14길이가 맞습니다.");
		} else {
			System.out.println("14길이가 아닙니다.");
		}
		
		//2
		int lastFirstNumber = Integer.parseInt(String.valueOf(jumin.charAt(8)));
		
		if (backFirstNumberCheck(lastFirstNumber)) {
			System.out.println("뒷번호 첫자리가 1~4 숫자가 맞습니다.");
		} else {
			System.out.println("뒷번호 첫자리가 1~4 숫자가 아닙니다.");
		}
		
		//3)
		backFirstNumberWMCheck(lastFirstNumber);
		
	}

}
