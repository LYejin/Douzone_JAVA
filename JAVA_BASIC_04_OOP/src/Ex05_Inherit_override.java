import kr.or.kosa.Emp;

class Test2 {
	int x = 100;
	void print() {
		System.out.println("부모함수 Test2");
	}
}

class Test3 extends Test2 {
	int x = 300; //c# 부모 무시하기(쓰지 마세요)
	
	//재정의 
	@Override
	void print() {
		System.out.println("자식이 부모의 함수를 재정의");
	}
	
	void print(String str) { // 오버로딩
		System.out.println("나 오버로딩이야 " + str);
	}
}

public class Ex05_Inherit_override {
	public static void main(String[] args) {
		Test3 test3 = new Test3();
		System.out.println(test3.x);
		test3.print();
		test3.print("overloading");
		
		Emp emp = new Emp(1000, "홍길동");
		System.out.println(emp); // emp.toString() 생략
		// kr.or.kosa.Emp@66133adc
		// kr.or.kosa.Emp + "@" + 66133adc 조합된 값 
		System.out.println(emp.toString()); // kr.or.kosa.Emp@66133adc 똑같다 재정의 ~> 값 바뀜 
		//emp.toString() 생략 되어 있음 
		
		/*
		 class Object {
		 	public String toString() {
		 		return 패키지명 + "@" + 주소값 
		 	}
		 }
		 
		 class Emp extends Object {
		 	
		 }
		 
		 */
	}

}
