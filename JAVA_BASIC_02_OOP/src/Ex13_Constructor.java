/*
 생성자 함수 (constructor)
 1. 특수한 목적 함수
 2. 목적( member field 초기화) >> static {}, { 초기자 블럭 잘 안 사용함 }
 
 3. 일반 함수와 다른점 
 3.1 함수 이름이 고정(class 이름 동일)
 3.2 return type 없어요 (객체 생성과 동실 호출) (return 을 받을 대상이 없다)
 3.3 실행지점 > new 객체 생성 > heap 객체 생성 > member field 자리 > 자동으로 생성자 함수 
 3.4 return type(x) >> void >> public void(생략) 클래스 이름 >> public 클래스이름() {}
 
 4. 왜 생성자를 만들까? : 생성되는 객체마다 [강제적]으로 member field 초기화 하고 싶다  
 
 class Car { String color; }
 >> 설계도를 만든이는 아무나 자동차 색상은 니가 알아서 해 -> 이 사람이 색상을 넣을 보장 없음 (안해도 어쩔 수 없어)
 
 class Car { String color = "blue" } 
 >> 객체를 생성하면 무조건 자동차의 blue
 
 문제) 자동차의 색상을 정하지 않고 출고
 설계도를 사용하는 사람이 자동차를 만들 떄 색상을 넣지 않으면 출고 안되게 하고 싶다 
 >> 생성자 설계 강제하지 않으면 객체가 안 만들어진다
 
 5. 생성자 함수 1개 만들까 ... 
 6. 생성자 함수는 overloading 기능 (강제 구현) ** Today Point
 ****** 생성자 함수를 쓰는 가장 중요한 목적은 member field [강제적] 초기화 ****
 
 */


class Car {
	String carname="포니";
	
	// 생성자 (default constructor) >> 기본 생성자 
	public Car() { 
		System.out.println("기본 생성자");
		carname = "내마음";
	}
}

class School {
	String schoolName = "강남";
	
	// public School() {} -> 숨어있었고 생성자 호출 가능 
	// 컴파일러가 만약 School 객체 생성할 때 생성자 함수가 없다면
	// 자동으로 생성자(default) 만들어서 실행 
	
}

/////////////////////////////////////////////////////////
class Car2 {
	String carname;
	// 생성자가 생략되어 있다
	// public Car2() {}
}

class Car3 {
	String carname; // null
	public Car3() { // default constructor method
		carname = "포니";
	}
}

// 설계도는 자동차를 만드는 데 있어서 2가지 선택 
class Car4 {
	String carname;
	public Car4() {
		carname="기본이름";
	}
	// overloading(함수) >> 생성자 함수(특수한) >> 생성자 >> overloading 가능 
	public Car4(String name) {
		carname = name;
	}
}

// 설계의도 
class Car5 {
	String carname;
	
	public Car5(String name) {
		carname = name;
	}
}

class Car6 {
	String carcolor;
	int door; // 문의 개수 
	
	public Car6() {
		carcolor = "기본 옵션";
		door=4;
	}
	
	// 옵션들 
	public Car6(String color, int num) {
		carcolor = color;
		door = num;
	}
}

/////////////////////////////////////////////////////////

public class Ex13_Constructor {
	public static void main(String[] args) {
		Car car = new Car(); // 괄호가 왜 있을까??? -> 생성자의 괄호다!!! 생성자를 호출한거다 
		System.out.println(car.carname);
		School school = new School(); // 생성자 함수가 없어도 생성자(default) 호출 
		
		Car4 car4 = new Car4();  
		Car4 car41 = new Car4("홍길동카"); // 생성자는 하나만 호출할 수 있다 그러나 this 배우면 여러개 가능 
		
	}
}
