package Lotto;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 기능 
- 연속된 수 나오면 제거
- 이전 5회차 번호 제외
- 이전 5회차 중 가장 많이 나온 번호는 넣어주기
*/

public class Lotto {
	private Scanner scanner;
	private int[] lottoNumber;
	FileReader fr = null;
	BufferedReader br = null;
	FileOutputStream fos = null;
	BufferedOutputStream bos = null;
	

	public Lotto() { // 생성자
		lottoNumber = new int[6];
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

	private String lottoDrawing() {
		Set<Integer> ts = new TreeSet<>();
		// 중복값 제거
		while (ts.size() < 7) {
			int num = (int) (Math.random() * 45 + 1);
			ts.add(num);
		}
		return ts.toString();
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

	// 랜덤 번호 뽑기 (5개 숫자) + 5회차에 나온 애들 제거 및 많이 나온 숫자 제외, 연속된 수 제거
	private void randomNumberDrawing() {
		int[] lottoArray = lottoDrawing5();
		int bn = bestNumber(lottoArray);
		lottoNumber[0] = bn;
		for (int i = 1; i < 6; i++) {
			lottoNumber[i] = (int) (Math.random() * 45 + 1);
			if (lottoArray[lottoNumber[i]] >= 1) {
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

	public void start() {
		selectMenu();
	}
	
	public void Write() {
		try {
			FileWriter fw = new FileWriter("Lotto.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("로또 번호 : ");
			bw.write(lottoDrawing());
			bw.newLine();
			bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
		}
	}
	
	public void Read() {
		try {
			fr = new FileReader("Lotto.txt");
			br = new BufferedReader(fr);
			//line 단위 처리 (장점)
			String line = "";
			for (int i=0; (line = br.readLine()) != null; i++) {
				System.out.println(line);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
