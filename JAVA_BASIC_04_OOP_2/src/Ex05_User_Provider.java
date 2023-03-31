/*
user 사용자 < > provider 제공자 

class A {}
class B {}

관계 : A는 B를 사용합니다

1. 상속 : A extends B
2. 포함 : A라는 클래스가 member field B를 사용 class A { B b; }
2.1 부분 
2.2 전체 

class B {}
class A {
	int i;
	B b; //A는 B를 사용합니다 (포함)
	A(){ //생성자 
		b = new B();
	}
}
>> main() {
	A a = new A(); // 같은 운명체
	a = null;
	a.b.자원명 
}

포함관계 
>> B는 독자생성 불가능 >> A라는 객체가 생성되면 B도 생성
>> 공동운명체 (전체집합) 
>> 자동차 엔진, 노트북과  cpu  

class B{}
class A{
	int i;
	B b; //A는 B를 사용합니다 (포함)
	A () {
	
	}
	//method
	void m(B b) {
		this.b = b;
	}
}

>>main() {
	A a = new A();
	a = null;
	B b = new B();
	// 필요에 따라서
	a.m(b);
	// 같은 운명은 아니다 같이 죽진 않겠구나 
	// 부분 집합
	// 노트북과 마우스, 학교와 학생 
}

A는 B를 사용합니다(참조) >> 포함 >> A가 B를 member field >> 생성(같이), 따로 
 */

interface Icall {
	void m(); // public abstract 
}

class D implements Icall {

	@Override
	public void m() {
		System.out.println("D ...Icall 인터페이스의 m() 재정의");
		
	}
}

class F implements Icall {
	@Override
	public void m() {
		System.out.println("F ...Icall 인터페이스의 m() 재정의");
	}
}

//현대적인 프로그래밍 방식은 (interface 대세) >> 유연성 >> 대충 만들어도 대충 ...
//느슨하게 (다형성) >> interface

class C {
	void method(Icall ic) { 
		// 함수의 parameter에는 Icall 을 구현하고 있는 (부모) 모든 객체의 주소는 올 수 있다 
		ic.m();
	}
}

public class Ex05_User_Provider {

	public static void main(String[] args) {
		C c = new C();
		D d = new D();
		F f = new F();
		c.method(d);
		c.method(f);

	}

}
