import kr.or.kosa.common.Car;

/*
 클래스 == 설계도 == 데이터 타입(사용자 정의)
 
 클래스의 구성 요소 (설계도라고 판단하려면 최소한 무엇을 가지고 있어야 한다.)
 [필드 + 메소드] + 생성
 (속성 + 함수(기능)) 
 
 필드 (member field) >> 데이터, 자료 정보를 담고 있다 >> [고유정보], [상태정보] (100 ~ 200 속도로 바뀜/바뀌는 것), [부품 정보](자동차는 엔진을 가지고 있다) >> field >> variable 
 함수 (method) >> 기능(행위) >> 자동차 >> 달린다, 멈춘다, 소리가 난다, 문을 연다....
 + 추가적으로 생성자(함수) >> 특수한 목적의 함수 >> 객체 생성 시 member field 초기화 목적으로 생성되는 함수, getter, setter (read, write)
 
 class 설계도 { // 커피 자판기 무엇을 가지고 있어야 되나..? 정보 : 커피 가루, 물, 컵
 	고유정보 
 	싱태정보
 	부품정보
 	
 	기능(행위)
 }
 
 클래스, 필드, 생성자함수, 메소드 : 영역 (범위) << 생성되는 장소(위치 -> 폴더) or 접근자 (한정자, 수정자)
 
 장소(위치) : 폴더(package)를 기반으로 ... 클래스 내부, 함수 내부, 제어문 내부 
 접근자     : public, private, default, protected
 
 kr.or.kosa.common 안에 생성한 Car 클래스는 > public class Car() >> 나 다 오픈할거
 kr.or.kosa.common 안에 생성한 AirPlane 클래스는 > class AirPlane { } >> 같은 폴더 안에서만 사용할 수 있다 
  
 >> default 같은 폴더에서만 공유 (같은 package 에서만 사용)
 >> 연습용으로 ... 또는 특정클래스의 도움을 주는 클래스 생성시
 
 연습용으로 빠르게 작업하려면 뭐가 가장 편할까???
 하나의 물리적 JAVA 파일은 여러개의 클래스를 가질 수 있다
 >> Ex01_Main.java(물리적 Java 파일) 파일은 그 안에 public class Ex01_Main 클래스를 가지고 있다 
 
 1. 개발에서는 필요한 클래스는 package 생성하고 그 안에 만들어서 사용합니다 (폴더 만들고 필요하면 public으로 사용 -> Car 클래스 처럼)
 2. 그냥 연습 ... 굳이 폴더 생성 ..필요 있을까? 물리적 파일 여러개 만들 필요가 있을까
 3. 하나의 물리적 파일에 여러개의 클래스를 만들어 쓸 수 있게 해줄까? (연습 ...)
 3.1 대신에 public 접근자는 한 놈만 가져야 된다! 
 
 */
class Emp{ // 연습할때나 공부할 떄만 사용하고 실제는 ㄴ
	
}

class Dept{ // 컴파일러가 default class Dept로 해석
	int deptNo; // 컴파일러가 default int deptNo 해석
	public String dname; // 에러는 아니지만 다른 폴더에선 사용 불가 ( class가 default라 public의 의미가 없다)
	private int count;   // private 가장 캡슐화(은닉), 감추다, 숨기다,
						// 설계자의 의도 : 클래스 내부에서만 사용 목적
						// 설계자의 의도 : 직접 할당을 막고 간접할당을 할동의 제어하겠다
	
	// 톡수한 함수
	// getter (읽기 전용), setter(쓰기 전용)
	public int getCount () { // 읽기를 지원 
		return this.count;
	}
	
	public void setCount(int count) { // 간접할당 : 함수를 통해서 할당해주는 것 
		if (count < 0) {
			this.count = 0; 
		} else {
			this.count = count;
		}
	}
	
}
/*
 폴더
 kr.or.kosa.dto.Test
 
 public class Test {
 	private int i;
 	
 	public void setI(int i) {
 		this.i = i;
 	}
 	
 	public int getI() {
 		return this.i;
 	}
 	
 	public void print() {
 		
 	}
 }
 */


// class Apt{} -> 같은 폴더에 같은 이름으로 정의 안된다

//class Test{ //The type Test is already defined Test가 또 있다. 
//	
//}

class Test{  // default
	int i; // default 클래스가 가지는 변수 (member field) >> instance variable 
	
	void print() { // default
		int num = 0; // 함수 안에 -> local variable 초기화를 통해 사용 
		for (int i = 0; i <= 100; i++) { // int i = 0 제어문 안에서 block variable
			
		}
		for (int i = 0; i <= 100; i++) { // int i = 0 제어문 안에서
			
		}
		int k = 0;
		for (k = 0; k <= 100; k++) { // int i = 0 제어문 안에서
			
		}
		System.out.println(k); // 101 값
		
	}
}

// data 변수는 : Test test = new Test();
// print() 함수가 호출 되었을 때 num 변수 생성
// int i 변수는 for문 실행 될 때 생성

public class Ex01_Main {

	public static void main(String[] args) {
		// 같은 폴더 안에 있는 클래스 ...
		Apt apt = new Apt();
		Car car = new Car(); // public class car {} 폴더의 구분없이 어디서나 사용 가능하다
		// 다른 방법
		kr.or.kosa.common.Car car2 = new Car(); // 하지만 반복되는 코드라서 좋지 않다
		
		Dept dept = new Dept();
		dept.deptNo = 100; // (삼각형은 default, 초록색 원 public)
		System.out.println(dept.deptNo);
		// dept.count => 같은 폴더라도 private로 절대 접근이 안된다. (캡슐화) 대신 get, set으로 접근
		dept.dname = "IT";
		System.out.println(dept.dname);
		
		dept.setCount(-100);
		System.out.println(dept.getCount());
		
		Test test = new Test();
		test.print(); // 함수라는 것은 호출에 의해서 불러짐 (heap에 올라감)
	}

}
