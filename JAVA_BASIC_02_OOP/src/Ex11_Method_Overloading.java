/*
 OOP 객체 지향 프로그래밍 (여러개의 작은 조각(작은 설계도) 만들어서 조합하는 행위(큰 설계도)하는 행위)
 >> 설계도를 재사용 
 
 1. 상속 (재사용성)
 2. 캡슐화 (은닉화) : private, 직접접근 ㄴㄴ, 간접할당 ..setter, getter (직접할당을 막고 간접할당을 통해 데이터 보호)
 3. 다형성 :하나의 타입으로 여러개 객체의 주소를 가질 수 있는 것 
 
 >> method >> overloading (오버로딩) method
 >> 하나의 이름으로 여러가지 기능을 하는 함수
 >> System.out.println(); 이름은 1개 ... 기능 여러개 (함수 parameter 개수, 타입)
 >> printInchar(), printInString(), printLnBool();
 1. 오버로딩을 사용하면 성능 향상 (x)
 2. 편하게 사용하려고 ... 개발자가 편하게 >> 설계자가 배려 (개발자) (ex. 이름을 20개 어떻게 다 외워... 그냥 통일!!)
 3. 오버로딩을 사용하지 않아도 문제 되지 않는다 
 
 문법)
 1. 함수의 이름은 같고 parameter [개수]와 [타입]을 달리 ...
 1.1 함수의 이름 동일
 1.2 parameter 개수, 타입을 달리한다.
 1.3 return type 오버로딩의 판단 기준이 아니다
 1.4 parameter 의 순서가 다름을 인정 (0)
 ex) m(int i, String s), m(String s, int i) => 다른 것으로 인정한다 
 
 */

class Human{
	String name;
	int age;
}

class OverT { // 설계도 
	int add(int i) {
		return 100 + i;
	}
	
//	void add(int i2) { 충동 (오버로딩이 아니에요)
//		
//	}
	int add(int i, int j) {
		return i + j;
	}
	
	String add(String str) {
		return str;
	}
	
	String add(String s, int i) {
		return "hello" + s;
	}
	
	String add(int i, String s) { // 순서가 달라도 인정 
		return "hello" + s;
	}
	
	//POINT
	void add(Human human) { // 인정 오버로딩
		human.age = 100;
		human.name = "홍길";
	}
}

public class Ex11_Method_Overloading {

	public static void main(String[] args) {
		System.out.println(); // 오버 로딩, 파라미터의 개수와 타입이 다름 
		
		OverT overt = new OverT();
		overt.add(10,10); // parameter 정의가 일치하는 함수가 자동 호출
//		overt.add(10.1f, 10); 
		overt.add("A");
		
		// 방법 1
		Human h = new Human(); // 재사용할 필요가 있음 
		overt.add(h);
		
		// 방법 2
		overt.add(new Human());
	}

}
