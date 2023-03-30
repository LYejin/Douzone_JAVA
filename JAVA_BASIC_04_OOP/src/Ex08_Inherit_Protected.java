import kr.or.kosa.Pclass;

/*
private
default (같은 폴더)
public
상속관계에서 protected

protected 양면성 >> default, public
>> 상속이 없는 클래스 안에서 protected >> default 동일
>> 결국 상속관계에서만 의미 >> public 

 */

class Dclass {
	public int i;
	private int p;
	int s; // default 같은 폴더 내에서 쓰는 것 
	protected int k; // default 동일 (상속이 아니면 사용하지 않아요)
}

class Child2 extends Pclass {
	void method() {
		this.k = 100; // 상속관계에서 >> 자식은 부모의 protected 자원을 사용가능(public)
		System.out.println(this.k);
//		m(); //접근 자식안에서 
	}
	// protectend 진정한 의미 (함수) : 재정의를 했으면 좋겠는데 ... 재정의 해 그래야 니가 쓰는 거야 

	@Override
	protected void m() {
		// TODO Auto-generated method stub
		super.m();
	}
	
}


public class Ex08_Inherit_Protected {

	public static void main(String[] args) {
		Pclass pclass = new Pclass();
//		pclass.i public 접근 
		
		Child2 child = new Child2();
	}

}
