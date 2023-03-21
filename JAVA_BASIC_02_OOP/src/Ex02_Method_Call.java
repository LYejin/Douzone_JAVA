import kr.or.kosa.Fclass;
import kr.or.kosa.Tv;

public class Ex02_Method_Call {

	public static void main(String[] args) {
		Fclass fclass = new Fclass();
		fclass.m();
		
		fclass.m2(1234);
		
		fclass.m3();
		
		int result = fclass.m3(); // 10000
		System.out.println("return value : " + result);
		
		result = fclass.m4(10);
		System.out.println("return value : " + result);
		
		result = fclass.opSum(-500);
		System.out.println("result value : " + result);
		
		result = fclass.max(10, 5);
		System.out.println(result);
		
		Tv tv = new Tv();
		
		tv.brand = "삼성";
		tv.channel = 100;
		tv.print();
		
		tv.channelMovePlus();
		tv.print();
		
		tv.channelMoveMinus();
		tv.print();
		
		
	}

}
