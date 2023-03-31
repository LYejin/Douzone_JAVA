
class Unit2{
	int hitpoint; //기본 에너지
	final int MAX_HP; //최대 에너지
	Unit2(int hp){
		this.MAX_HP = hp;
	}
}
//인터페이스 
//~ 할 수 있는 (수리할 수 있는)
interface Irepairable{}

//지상유닛 , 공중유닛 , 건물
class GroundUnit extends Unit2{
	GroundUnit(int hp) {
		super(hp);
	}
}


//공중유닛
class AirUnit extends Unit2{
	AirUnit(int hp) {
		super(hp);
	}
}

class CommandCenter  implements Irepairable{}

//유닛
class Tank2 extends GroundUnit implements Irepairable{
	Tank2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Tank2";
	}
	
}
class Marine2 extends GroundUnit{

	Marine2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	@Override
	public String toString() {
		return "Marine2";
	}
}


//Scv 광물캐기 , 수리 (탱크)
class Scv extends GroundUnit implements Irepairable{

	Scv() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	@Override
	public String toString() {
		return "Scv";
	}
	
	//Scv 구체화 , 특수화된 고유한 기능 구현
	//수리하다 (repair)
	//Tank2 , Scv ,CommandCenter
	
	//전자제품 매장 제품 1000개 >> buy() >> 1000개 buy함수 (x)
	//다형성 buy(Product n) ... 
	/*
	void repair(Tank2 tank) {
		
	}
	void repair(Scv scv) {
		
	}
	*/
	//GroundUnit 부모 (Tank2 , Marine2 , Scv)
	//void repair(Unit2 unit) >> class AirUnit extends Unit2(x) , Marine2(x)
	//void repair(GroundUnit unit) >> Tank2 , Marine2(x) , Scv
	
	//CommandCenter repair  서로의 공통점 (연결고리 >> 부모가 같지 않아요)
	
	//제가 한번 해볼게요 
	//interface Irepairable{}
	
	//class CommandCenter implements Irepairable {}
	//class Tank2 extends GroundUnit implements Irepairable {}
	//class Scv extends GroundUnit implements Irepairable {}
	
	//부모로서 Irepairable 서로 연관성이 없는 자원에 대해서 ... 같은 부모를 ...제공
	
	//다형성
	void repair(Irepairable repairunit) {
		//Tank2 , Scv , CommandCenter
		//수리하는 방법이 달라요 
		//Tank2 , Scv  >> HP 가지고 올려주면 되요 
		//다른 방법으로  repair
		
		/*
		답) Tank2 , Scv 만 오면 > Unit2
		Unit2 unit = (Unit2)repairunit; //Down
		unit.hitpoint+=5;
		
		CommandCenter  > Unit2 연관성이 없다
		Unit2 unit = (Unit2)repairunit; (예외) 
		
		repair(Irepairable repairunit) 사용
		비교 (타입) >> instanceof >> 타입 질문
		
		*/
		//repairunit 일반 Unit2 아니냐 판단해서 적용
		if(repairunit instanceof Unit2) {
			//Tank2 , Scv
			
			//Irepairable 는 최상위 타입이고 아무것도 가지고 있지 않아요
			//결국 hitpoint 나  MAX_HP 자원을 쓰기 위해서는
			//한단계 아래 Unit2 타입으로 가야 하네여
			
			Unit2 unit2 = (Unit2)repairunit; //Irepairable repairunit >> 
			if(unit2.hitpoint != unit2.MAX_HP) {
				unit2.hitpoint = unit2.MAX_HP; //완충
			}
			
		}else {
			//건물
			System.out.println("다른 충전 방식을 통해서 repair 합니다");
		}
	}
}

public class Ex04_Interface_Poly {

	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Marine2 marine2 = new Marine2();
		Scv scv = new Scv();
		
		CommandCenter center = new CommandCenter();
		
		//전투
		tank.hitpoint -= 20;
		System.out.println("탱크 :  " + tank.hitpoint);
		System.out.println("Scv 수리 요청");
		scv.repair(tank);
		System.out.println("탱크 수리 완료 : " + tank.hitpoint);

		scv.hitpoint-=30;
		System.out.println("scv : " + scv.hitpoint);
		System.out.println("Scv 수리 요청");
		scv.repair(scv);
		System.out.println("scv 수리 완료 : " + scv.hitpoint);
		
		
		scv.repair(center);
	}

}
