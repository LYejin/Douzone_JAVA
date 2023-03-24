package kr.or.kosa;
/*
 우리 회사는 비행기를 주문 제작 판매 하는 회사입니다 
 우리 회사는 비행기를 생산하는 설계도를 만들려고 합니다
 
 요구사항
 1. 비행기를 생산하고 비행기의 이름과 번호를 부여해야 한다
 2. 비행기가 생산도면 비행기의 이름과 번호가 맞게 부여되었는지 확인 하는 작업이 필요하다(출력) -> 기능
 3. 공장장은 현재까지 만들어진 비행기의 총 누적대수를 확인 할 수 있다 ->
 
 AirPlane air101 = new AirPlane();
 air101.자원 = 대한항공 
 air101.자원 = 707
 
 비행기 이름, 번호 출력 
 */


//public class AirPlane {
//	private String airPlaneName; // 캡슐화 
//	private int airPlaneNumber;
//	private static int airPlaneTotalCount; // 모든 객체가 공유하는 자원 
//	
//	public void setAirPlane(String name, int number) { // 생성자를 안 배워서 생성자처럼 만들기 
//		airPlaneName = name; // this 안 배워서 변수면 안 이뻐요 
//		airPlaneNumber = number;
//		airPlaneTotalCount++; // 누적 
//		airPlanePrint();
//	}
//	
//	private void airPlanePrint() { // 클래스 내부에서 사용되는 함수 처럼 (private 함)
//		System.out.printf("비행기 이름 : %s, 비행기 번호 : %d \n", airPlaneName, airPlaneNumber);
//	}
//	
//	public void airPlaneTotalPrint() {
//		System.out.printf("total : %d \n", airPlaneTotalCount);
//	}
//}


// 생성자를 사용해서 아래 코드를 수정하세요
// 아직 this는 쓰지 마세요 
public class AirPlane {
	private String airPlaneName; // 캡슐화 
	private int airPlaneNumber;
	private static int airPlaneTotalCount; // 모든 객체가 공유하는 자원 

	// public AirPlane() {} 사용하지 않아요 
	public AirPlane (String airPlaneName, int airPlaneNumber) {
		this.airPlaneName = airPlaneName; // this 안 배워서 변수면 안 이뻐요 
		this.airPlaneNumber = airPlaneNumber;
		airPlaneTotalCount++; // 누적 
//		airPlanePrint(); 생성자는 함수를 호출할 수 없다 
	}

	public void airPlanePrint() { // 클래스 내부에서 사용되는 함수 처럼 (private 함)
		System.out.printf("비행기 이름 : %s, 비행기 번호 : %d \n", airPlaneName, airPlaneNumber);
	}

	public void airPlaneTotalPrint() {
		System.out.printf("total : %d \n", airPlaneTotalCount);
	}
}