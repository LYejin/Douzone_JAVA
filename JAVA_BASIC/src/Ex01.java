import kr.or.kosa.Car;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		//A >> Car.class
		//B >> Car.class
		//C >> A,B 샀다. >> 하나의 장소 >> 어떤 문제? 
		
		//자동차 생상
		Car mycar = new Car();
		mycar.setDoor(2);
		mycar.setCarColor("검정색");
		mycar.run();
	}

}
