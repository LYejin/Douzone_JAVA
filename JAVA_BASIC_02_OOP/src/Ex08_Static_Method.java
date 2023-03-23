/*
static member field : 객체 간 공유자원
static method : >> public static void main (첫시간에 ...)

1. 객체 생성 없이 사용
2. 편하게 빠르게 ...
3. 많이 사용하니까 
4. 설계도 : 자원은 많이 사용할 것 같아 ... new ... 참조변수 ...
>> 자원을 많이 사용 >> 편하게 쓰게 하자 >> new 없이 사용하게 하자 >> 기능 (static 설계) 


 */
class StaticClass {
	int iv;
	
	static int cv;
	
	static void print() {
		System.out.println("static print");
		// static 함수
		// 일반자원 int iv; 생성 시점은 (static 자원은 일반 자원보다 우선한다)
	}
	
	void printIv() {
		// 일반함수 
		// static int cv;
		// Why : static 자원은 객체 생성 이전에 memory 로드
		
		cv = 100;
	}
}
// 공존의 관계 : 생성시점에 대한 해결 제시 
// 혹자는 : 끼리끼리 놀아라 
public class Ex08_Static_Method {
	public static void main(String[] args) {
		StaticClass.print();   
		
		StaticClass sc = new StaticClass();
		sc.printIv();
		System.out.println(sc.cv);
	}

}
