/*
1. 자바가 제공하는 기본 타입(원시 타입) >> 8가지
2. 8가지 타입은 값을 저장하는 타입
숫자 정수(음의 정수,0,양의정수) byte(8bit) -128 ~ 127
                         char(2byte) 한문자 (내부적으로는 정수값) 
                         영문자, 특수문자, 공백 (1byte), 한글 1자(2byte)
                         협의 (국제) >> 모든 글자는 2byte로 하자 >> 표준화 >> unicode 체재 >> 아스키 코드
                         ex) char c = 'A' , char ch = "가" 상관없음. 2byte라서
                         short 호환성  
                         int (4byte : -21억 ~ 21억) **~~** 정수 리터럴의 기본 타입 == int
                         long (8byte) 
    실수(부동소수점)         float (4byte)
                         double (8byte)
논리 						(boolean) 참 거짓을 표현하는 타입 (true, false) 판단 

현재는 대충 ...
정수 int, 실수 double 타입을 사용하면 별 문제 없다.

가장 많이 사용되는 타입 (String) -> 근데 기본적인 타임에 왜 없을까?
String str="홍길동";

우리가 가장 많이 사용하는 String 은 클래스 입니다.
String 타입은 문자열을 담을 수 있습니다.
ex) String str = new String("홍길동");
 */


public class Ex03_DataType {

	public static void main(String[] args) {
		// int (-21 ~ 21)
		int num = 100000000;
		System.out.println("num : " + num);
		//int num2 = 100000000000; //The literal 100000000000 of type int is out of range
		// literal 개발자 직접 입력한 값 (있는 그대로의 값)
		// 컴파일 오류
		// 나는 4byte 크기의 방인데 ... 더 큰 값은 담을 수 없어 그냥 실행이 안된다.
		
		//1. 해결방법
		//int num2 = 100000000000;
		long num2 = 10000000000L;
		// 개발자가 입력하는 정수의 범위는 int 벗어나면 안된다.
		System.out.println("num2: " + num2);
		
		long num3 = (long)100; // 속지 않으려면 값을 보지 말고 타입을 보세요. (리터럴 값도)
						// long num3 = (long)100; -> 암시적 형변
						// 시적 형변환 (자동으로 컴파일러가 ... 큰 타입에 작은 타입을 넣는 것은)
						// 작은 타입에 있는 값을 큰 타입에 넣는 것은 당근이지
		// 해결하세요
		// 손실이 발생하더라 담아 보겠다 
		//int num4 = 10000000000; //The literal 10000000000 of type int is out of range 할당 불가 
		//int num4 = 10000000000L; // Type mismatch: cannot convert from long to int / int에 담을 수 없어..타입의 mismatch
		// 담아담아 (손실 오케!!) 명시적 형변환 (타입 변환), 캐스팅 
		int num4 = (int) 10000000000L;
		System.out.println("타입 변환 : " + num4);
		// 결과 -> 타입 변환 : 1410065408 -> 쓰레기 값, 유령 데이터 
		// 정상적인 해결 방법이 아니다. (버려지는 값)
		
		// 데이터 손실이 없어요 다행히 ... 있을 수도 있어 
		//1. 강제 형변
		//int num5 = (int) 1000L; // Type mismatch: cannot convert from long to int
		
		//2. 담는 그릇을 크게 
		//long num5 = 1000L;
		
		
		
		// 유니코드(영어: Unicode)는 전세계의 모든 문자를 컴퓨터에서 일관되게 표현하고 낭로 수 있도록 설계한 표준어다.
		
		
		// char 2byte : 한 문자를 표현하기 위해서 만든 타입
		// 영문자, 특수 문자, 공백, 한글 >>> 한문자로 표현하는 표준화
		// 한문자 >> 'A' , '가', ' '
		// 문자열 >> "abcd" >> String str="abcd";
		
		char ch = '가';
		System.out.println("한문자 : " + ch);
		// char ch2 = '가나'; // Invalid character constant 예외 발생, 컴파일도 안된다. 한문자만 가능
		ch = 'a';
		ch = 'A';
		
		// char 정수 타입 (문자를 저장하지만 내부적으로 정수값을 가지고 있다)
		// 아스키 코드표에서 십진수값과 문자값을 비교해 보세요.
		int chint = ch;
		System.out.println("ch 문자를 십진수로 보면 : " + chint); // 65
		
		//int chint = ch;
		//내부적으로 암묵적으로 자동 형변환이 발생 했어요(자동으로)
		//int chint = (int) ch;
		
		int chint2 = 'a';
		System.out.println();
		int intch2 = (int) chint2; //개발자가 직접 형변환 문제 없다
		
		int intch3 = 65;
		//char chint3 = intch3; // Type mismatch: cannot convert from int to char
		
		// 1. 해결 명시적 형변환 >> 데이터 손실 발생 
		//char chint3 = (char) intch3;
		
		// 2. 해결 받는 그릇을 크게 ... (개발자의 의도 문자를 보고 싶어요)
		//int chint3 = intch3;
		
		// char chint3 = intch3; >> 위로 올라가서 char intch3 = 65;
		
		char chint3 = (char) intch3;
		System.out.println("chint3 가지는 문자값 : " + chint3);
		
		/*
		 1. 할당에 있어서 값을 보지말고 값이 가지는 타입을 보자
		 1.1 리터럴 값에 대해서
		 1.1.1 정수 리터럴의 기본 타입은 int
		 1.1.2 실수 리터럴의 기본 타입은 double
		 
		 2. 암시적 형변환, 명시적 형변환
		 2.1 큰 타입에 작은 타입의 값을 넣는 것은 암시적 형변환을 하기에 개발자 ...그냥 ...사용
		 2.2 작은 타입에 큰타입을 넣고자 한다면 자동 형변환을 지원하지 않기 때문에 강제적(명시적) 형변환
		 2.2.1 접미사 L, l , (int) 정수, (long) 정수
		 KEY POINT 강제적 형변환 데이터 손실을 감수 ....책임은 개발자가 져야한다.
		 ex) char c = (char) int 범위값 ... 손실 발생 ...
		 
		 */
		 
		 // String 타입 (8+1) 값타입 처럼 사용하자 >> 값타입 처럼 써도 문제 없게 만들었다.
		 // 문자열 >> 문자의 집합 >> 문자의 배열은 >> 문자열 
		 // int , long 동일하게 사용하세요.
		
		 String name = "홍길동"; 
		 name = "홍길동 바보";
		 String color = "red";
		 color = color + " 방가방가"; // 오라클 + 산술만 해요 >> 결합 연산자 || 
		 System.out.println(color);
		 
		 //Tip)
		 // 연산자는 언어마다 표현이 다르다.
		 // JAVA >> + >> 산술도 하고 결합도 한다.
		 // ORACLE >> + 산술만 해요. 결합 연산자는 ||
		 
		 
		 String path = "C:\\Temp";
		 String path2 = "C;\\Temp";
		 path = "C:\\T\te\tm\tp\nhello";
		 System.out.println(path);
		 System.out.println(path2);
		 float f = 3.14f;
		 
		 float data = 1.12345678f;
		 System.out.println("float data : 1.123456789 : " + data);
		 
		 double data2 = 1.123456789123456789;
		 System.out.println("double data2 : 1.123456789123456789 : " + data2);
		 
		 double data4 = 100;
		 int number = 100;

		 int result2 = (int) data4  + number; // double + int >> double
		 
	}
}
