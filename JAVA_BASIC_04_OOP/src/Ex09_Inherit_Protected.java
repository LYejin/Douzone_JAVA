import kr.or.kosa.Bird;

class Bi extends Bird {

	@Override
	protected void moveFast() {
		super.moveFast();
	}
}

class Ostrich extends Bird {
	// Ostrich
	// 특수화, 구체화
	void run() {
		System.out.println("run .....");
	}

	@Override
	protected void moveFast() { // 함수 이름이 동일하다는게 장점이다 
		run();
	}
	
}

public class Ex09_Inherit_Protected {

	public static void main(String[] args) {
		Bi bi = new Bi();
		bi.fly();
		bi.moveFast(); // bi에서 재정의 해야 사용 가능 
		
		Ostrich o = new Ostrich();
		o.fly();
		o.moveFast();
	}

}
