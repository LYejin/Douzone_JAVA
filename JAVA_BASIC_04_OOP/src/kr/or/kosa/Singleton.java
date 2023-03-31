package kr.or.kosa;
/*
디자인 패턴 (생성에 관련된 이야기) >> new 

싱글톤 : 객체 하나를 만들어 공유
의도 : 하나의 객체를 공유하는 보장성 코드를 만들어라 


공유프린터
공유 IP

Singleton s = new Singleton();
Singleton s2 = new Singleton();
Singleton s3 = new Singleton();

 */
public class Singleton {
	private static Singleton p; // null 
	private Singleton() {
		// 생성자 접근자 private >> 생성자 호출하지 못해서 객체 new 하지 못하게 막음 
	}
	public static Singleton getInstance() {
		if (p == null) { // 한번 생성되면 계속 똑같음 -> 같은 주소 보장
			p = new Singleton(); // POINT 같은 클래스 내부에서는 pubilc, private 볼 수 있어요 
		}
		return p; // 항상 같은 주소(메모리) 보장 
	}
}
