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
- 이전 5회차 번호 제외
- 이전 5회차 중 가장 많이 나온 번호는 넣어주기
 
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
	private int[] lottoNumber = new int[6];

	public Lotto() { // 생성자
		scanner = new Scanner(System.in);
	}

	private String showMenu() {
		System.out.println("***************************");
		System.out.println("**1. 당첨 예상 번호 추출하기**");
		System.out.println("**2. 프로그램 종료 ^^! ^^! ^^**");
		System.out.println("***************************");
		System.out.print("원하는 메뉴 번호를 입력하세요 : ");
		String selectnum = scanner.nextLine();
		return selectnum; // 선택한 메뉴 받음
	}

	private void selectMenu() {
		while (true) {
			switch (showMenu()) {
			case "1": randomNumberDrawing();
				break;
			case "2":
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("올바른 번호를 입력해주세요.");
			}
		}
	}

	// 5개 번호 5번 뽑기 번호 저장
	private int[] lottoDrawing5() {
		int[] lottoArray = new int[46];
		for (int z = 0; z < 5; z++) {
			int[] lotto = new int[6];
			// 중복값 제거
			for (int i = 0; i < 6; i++) {
				lotto[i] = (int) (Math.random() * 45 + 1);
				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
				lottoArray[lotto[i]]++;
			}
		}
		for (int i=0; i<46;i++) {
			 System.out.println(i + "번 : " + lottoArray[i]);
		}
		return lottoArray;
	}

	// 5회차 중 가장 많이 나온 숫자 구하기 (겹칠시 제일 작은 값) -> 무조건 넣어주고
	private int bestNumber(int[] intArr) {
		int max = intArr[0];
		int num = 0;
		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] > max) {
				max = intArr[i];
				num = i;
			}
		}
		System.out.println("maxNum : " + num);
		return num;
	}

	// 랜덤 번호 뽑기 (5개 숫자) + 5회차에 나온 애들 제거 및 많이 나온 숫자 제외, 연속된 수 제거
	private void randomNumberDrawing() {
		int[] lottoArray = lottoDrawing5();
		int bn = bestNumber(lottoArray);
		lottoNumber[0] = bn;
		for (int i = 1; i < 6; i++) {
			lottoNumber[i] = (int) (Math.random() * 45 + 1);
			int number = lottoArray[lottoNumber[i]];
			if (number >= 1) {
				i--;
				continue;
			}
			for (int j = 0; j < i; j++) {
				if (lottoNumber[i] == lottoNumber[j] || lottoNumber[i] == lottoNumber[j]+1 || lottoNumber[i] == lottoNumber[j]-1) {
					i--;
					break;
				}
			}
		}
		sortArr(lottoNumber);
		System.out.print("당첨 예상 번호는 ");
		for(int i = 0 ; i < lottoNumber.length ; i++) {
			System.out.print(lottoNumber[i] + " ");
		}
		System.out.print("입니다.");
	}

	// 정렬 한번 해주기
	private void sortArr(int[] lotto) {
		// 정렬
		for (int i = 0; i < lotto.length; i++) {
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					int swap = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = swap;
				}
			}
		}
	}

	public void start() {
		selectMenu();
	}

	// 여러가지 기능을 가지는 함수를 생성 활용하세요
	// 기능 >> method >> 함수 하나당 기능 하나
	// public >> 참조변수
	// private >> 내부 사용 (공통)
	// 실번호 추출해 주세요
	// 중복값 나오면 안되요
	// 낮은 순으로 정렬해 주세요
	// 화면에 출력해 주세요
	// 메뉴 기능을 만들어 주세요
}
