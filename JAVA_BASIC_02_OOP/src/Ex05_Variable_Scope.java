
/*
 instance variable >> class Car { private String color; }
 >> 생성되는 객체마다 다른 값을 가질 수 있다
 >> 만약 초기값을 설정한다면 어떤 의미 : 기본적인 어떤 값을 초기화하겠다 (private String color="black")
 
 local variable >> class Car { public void move() { int speed = 0; 반드시 초기화 } }
 >> public static void main(String[] args) { 선언된 변수 지역변수 초기화 }
 
 block variable >> class Car { public void move() { for(int i=0 ... }{} } block
 
 Today Point
 static variable >> 공유자원 (heap에 생성된 객체간 공유자원)
 1. 객체 생성 이전에 memory에 올라가는 자원 (heap, stack, 클래스(method) 영역 class area)
 2. 설계도를 가지고 구체화(메모리) 올리는 방법 유일 : new 
 3. static 자원은 new 없이도 메모리에 올라간다! ****** (class 또는 method area)에 올라감 
 
 Ex05_Variable_Scope 클래스 >> new >> 메모리 >> 이 중에 필요한 자원 사용가능
 
 javac 컴파일
 java Ex05_Variable_Scope 엔터 
 1. Ex05_Variable_Scope 분석 (누가, 어떤 자원, 언제 ...) 정보 메모리 올려요 ...
 2. 안에 static 이런 것이 붙어 있는 member field, method 보이면 메모리에 올려요 
 3. 그런데 static 함수중에서 약속 ... 실행하겠다고 (진입점, 실행점)
 
 */

class VariableClass {
	int iv; //instance variable
	/*
  	1. member field , instance variable
  	2. iv 언제 사용가능 할까요 (메모리에 언제 올라 갈까요) 
  	2.1 VariableClass v = new VariableClass(); >> heap 객체 생성 >> 객체 안에 iv 생성
        VariableClass v2 = new VariableClass();>> heap 객체 생성 >> 객체 안에 iv 생성
    3. 목적 : 데이터 (정보) ,자료 를 담을 목적
    3.1 정보 : 고유 , 상태 , 부품(class)
    -생성되는 객체마다 다른 값을 가질 수 있다
    -그래서 초기화를 해서 값을 강제하지 않는다 
    -default 값을 가지고 있다 (int > 0 , double > 0.0 , char > 빈문자'\u0000' ,
                         boolean >false , String > null, Car > null)
    -iv 변수의 생성 시점 : new 라는 연산자를 통해서 heap  Variable 이름의 객체가 만들어지고 나서 바로생성(그 안에)
   */
	static int cv; // 프로그램 종료될 때까지 계속 가지고 있기에 메모리에 좋지 않다 
	
	void method() {
		int lv= 0;
		for (int i =0; i<=100; i++) {
			
		}
	}
}

public class Ex05_Variable_Scope {

	public static void main(String[] args) { // new 하지 않고 실행시키기 위해 new 안쓰고 올린다음에 main이 있으면 stack으로 내린다 
		VariableClass.cv = 100; // 클래스이름.static 자원 
		
		VariableClass vc = new VariableClass();
		vc.iv=100;
		vc.method();
		vc.cv= 200; // 클래스의 주소가 heap에 들어가있어서 class area의 주소로 연결 돼 class 값 변경
		
		VariableClass vc2 = new VariableClass();
		System.out.println(vc2.cv); //어떤 값
		vc2.cv = 400;
	}

}
