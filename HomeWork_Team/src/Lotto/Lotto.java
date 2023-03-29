package Lotto;

import java.util.Scanner;

/*
 로또 시스템 class 설계 하세요 ^^
 목적 : 클래스의 구성 요소를 이해하고 활용 할 수 있다
 member field , constructor (초기화) , method 활용
 접근자 한정자의 사용 , ....
 기능을 함수 단위로 분리 할 수 있다 ^^
 함수의 return type 과 parameter 를 활용할 수 있다
 
 결국 Ex07_Array_Lotto_Quiz main함수 있는 내용을 별도의 기능으로 구현하세요
 
 그러면
 Ex08_Lotto 의 main 함수안에서
 
 기능 
- 연속된 수 나오면 제거
- 랜덤 잭팟 숫자(컴퓨터)를 맞추면 현재 번호와 로또 번호가 몇 개 일치하는지 알려주고 바꿀 기회를 준다
- 입력한 숫자 외 자동입력
 
 Lotto lotto = new Lotto();
 lotto.start(); 
 이런식으로 실행하면
 메뉴가 나오고  .... 선택시 번호 추출하고 ..... 선택시 종료 되는 기능을 구현하시면 됩니다
 
 그리고 조별만의 특수한 기능을 하나 추가하세요  
예를 들면 Lotto 배열의 평균이 특정 범위에 있으면 재추출
예를 들면  특정 값을 입력하면 Lotto 번호에서 배재하기
예를 들면  짝수값 배재하기 , 홀수값 배재하기 
지난차수  번호와 동일하면 재추출 등 1개 추가적인 선택 
*/


public class Lotto {
	private Scanner scanner;
	
	public Lotto() { // 생성자 
		scanner = new Scanner(System.in);
	}
	
	private String showMenu() {
		System.out.println("***************************");
		System.out.println("**1. 당첨 예상 번호 추출하기**");
		System.out.println("**2. 프로그램 종료 ^^! ^^! ^^**");
		System.out.println("***************************");
		System.out.println("원하는 메뉴 번호를 입력하세요 :");
		String selectnum = scanner.nextLine();
		return selectnum;
	}
	
	public void start() {
		showMenu();
	}
	
	//여러가지 기능을 가지는 함수를 생성 활용하세요
	// 기능 >> method >> 함수 하나당 기능 하나
	// public >> 참조변수
	// private >> 내부 사용 (공통)
	// 실번호 추출해 주세요
	// 중복값 나오면 안되요
	// 낮은 순으로 정렬해 주세요
	// 화면에 출력해 주세요
	// 메뉴 기능을 만들어 주세요
}
