import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import kr.or.kosa.dto.Cinema;

public class Ex10_Cinema {
	public static void seatCheck(Cinema[][] cinemaArr) {
		System.out.println("********좌석현황*******");
		int n = 1;
		for (int i=0; i<cinemaArr.length; i++) {
			n=1;
			for (int j=0; j<cinemaArr[i].length; j++) {
				int num = i+1;
				if (cinemaArr[i][j].isTF()) {
					System.out.print("[예매]");
				} else {
					String str = ("[" + num + "-" + n + "]");
					System.out.print(str);
				}
				n++;
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = 0;
		
		Cinema[][] cinemaArr = new Cinema[4][5];
		
		// 자리 초기화 
		int n = 1;
		for (int i=0; i<cinemaArr.length; i++) {
			n=1;
			for (int j=0; j<cinemaArr[i].length; j++) {
				int num = i+1;
				String str2 = ( num + "-" + n );
				cinemaArr[i][j] = new Cinema(str2);
				n++;
			}
		}
		
		
		while (number != 4) {
			System.out.println();
			System.out.println("*****************");
			System.out.println("*****영화시스템*****");
			System.out.println("*****************");
			System.out.println("1. 예매하기"); // 예매하기 할때 생성?
			System.out.println();
			System.out.println("2. 예매조회");
			System.out.println();
			System.out.println("3. 예매취소");
			System.out.println();
			System.out.println("4. 종료");
			
			number = Integer.parseInt(br.readLine());
			switch (number) {
			case 1 : 
					seatCheck(cinemaArr);
					System.out.println("좌석을 선택해주세요. 예1-1)");
					System.out.println("이미 애매된 좌석은 \"예매\"라고 표시됩니다.");
					String[] s = br.readLine().split("");
					int a = Integer.parseInt(s[0])-1;
					int b = Integer.parseInt(s[2])-1;
					cinemaArr[a][b].reservation();
					break;
			case 2 : System.out.println("예매번호를 입력해주세요.");
					String str = br.readLine();
					for (int i=0; i<cinemaArr.length; i++) {
						for (int j=0; j<cinemaArr[i].length; j++) {
							if (cinemaArr[i][j].getResNumber().equals(str)) {
								cinemaArr[i][j].reservationSearch();
							}
						}
					}
				break;
			case 3 : System.out.println("예매번호를 입력해주세요.");
					String str2 = br.readLine();
					for (int i=0; i<cinemaArr.length; i++) {
						for (int j=0; j<cinemaArr[i].length; j++) {
							if (cinemaArr[i][j].getResNumber().equals(str2)) {
								cinemaArr[i][j].reservationFalse();
							}
						}
					}
				break;
			case 4 : System.out.println("종료합니다.");
					System.exit(0);
			default :
				System.out.println("올바른 번호를 선택해주세요");
			}
		}

		
		
	}

}
