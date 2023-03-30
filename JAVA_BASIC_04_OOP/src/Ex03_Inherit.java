// 두 개의 설계도 
class Tv {
	boolean power;
	int ch;
	
	void power () { // 두개의 기능을 하나의 함수 처리 
		// boolean 
		this.power = !this.power; // 전원 스위치 
	}
	
	void chUp() {
		this.ch++;
	}
	
	void chDown() {
		this.ch--;
	}
}

class Vcr { // 비디오 플레이어 
	boolean power;
	void power() {
		this.power = !this.power;
	}
	void play() {
		System.out.println("재생하기");
	}
	void stop() {
		System.out.println("정지하기");
	}
	void rew() {}
	void ff() {}
	
}

// 설계도 2개
/*
class Tv
class Vcr

제품
Tv 와 Vcr 합쳐진 제품 

TvVcr 출시

class TvVcr extends Tv, Vcr (x) 다중 상속 금지 
>> 계층적 상속 (할아버지, 아버지 계층 구조 확인 어려움, 자원이름이 똑같으면 충돌 ... 사용불가)

1. class TvVcr { Tv tv;  Vcr vcr;}
2. class TvVcr
3. class TvVcr 
4. class TvVcr extends Tv {}
5. class TvVcr  
6. class TvVcr extends Tv { Vcr vcr; }

한놈은 상속 하고 한놈은 포함
둘다 포함

TvVcr 메인 기능 ....(비중)

 */

class TvVcr {
	Tv tv;
	Vcr vcr;
	
	TvVcr() {
		this.tv = new Tv(); // 초기화 (주소값 할당)
		this.vcr = new Vcr();
	}
}

class TvVcr2 extends Tv {
	Vcr vcr;
	TvVcr2(){
		this.vcr = new Vcr();
	}
}

public class Ex03_Inherit {

	public static void main(String[] args) {
		TvVcr my = new TvVcr();
		my.tv.power();
		my.vcr.power();
		System.out.println(my.tv.power);
		System.out.println(my.vcr.power);
		//------------------------------------
		
		TvVcr2 tv2 = new  TvVcr2();
		
		tv2.power();
		System.out.println("TV전원 : " + tv2.power);
		tv2.vcr.power();
		System.out.println("VCR전원 : " + tv2.vcr.power);
	}
}
