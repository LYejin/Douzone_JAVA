
class Pbase {
	int p = 100;
}

class Cbase extends Pbase {
	int c = 200;
}

class Dbase extends Pbase {
	
}


public class Ex11_Inherit_Poly {

	public static void main(String[] args) {
		// 상속관계에서 부모타입의 참조변수는 여러개의 자식타입 주소를 가질 수 있다 (다형성)
		Cbase cbase = new Cbase();
		System.out.println(cbase.toString());
		
		// 다형성
		Pbase pbase = cbase;
		
		Dbase dbase = new Dbase();
		pbase = dbase;
		System.out.println(pbase.toString());
		/////////////////////////////////////
		// 부모주소를 자식에게 주는 건 불가 -> 강제 변환이 있음 -> down casting
		Cbase ccc = (Cbase) pbase; // down casting 
	}

}
