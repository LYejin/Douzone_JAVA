
public class Ex09_Static_Mehod {
	void method() {
		System.out.println("나 일반함수야");
	}
	
	static void smethod() {
		System.out.println("나 static 함수야");
	}
	
	public static void main(String[] args) {
//		Ex09_Static_Mehod.smethod(); 이 방법도 가능
		smethod(); // 이것도 가능 
		Ex09_Static_Mehod sm = new Ex09_Static_Mehod();
		sm.method();
		
		sm.smethod(); // 호출가능 
	}
}
