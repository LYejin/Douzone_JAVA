import kr.or.kosa.AirPlane;

public class Ex06_Static_AirPlane {

	public static void main(String[] args) {
//		AirPlane airPlane1 = new AirPlane();
//		airPlane1.setAirPlane("대한항공", 808);
//		airPlane1.airPlaneTotalPrint();
//
//		AirPlane airPlane2 = new AirPlane();
//		airPlane2.setAirPlane("진에어", 707);
//		airPlane2.airPlaneTotalPrint();
//
//		AirPlane airPlane3 = new AirPlane();
//		airPlane3.setAirPlane("예진항공", 101);
//		airPlane3.airPlaneTotalPrint();
		
		//AirPlane.airtotalcount static private 접근불가 (간접) 
		//air1.airtotalcount 막았어요 -> 오직 함수를 통해 접근하려고 함 
		
		AirPlane air1 = new AirPlane("대한항공", 101);
		air1.airPlanePrint();
		air1.airPlaneTotalPrint();
		
		AirPlane air2 = new AirPlane("아시아나", 101);
		air2.airPlanePrint();
		air2.airPlaneTotalPrint();
	}

}
