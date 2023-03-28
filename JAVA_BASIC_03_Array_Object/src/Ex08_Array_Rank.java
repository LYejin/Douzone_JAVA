
public class Ex08_Array_Rank {

	public static void main(String[] args) {
		/*
		 다차원 배열 (2차원)
		 [행][열]
		 영화관 좌석, PC방 좌석, 지도 좌표값(경도, 위도), 오목, 엑셀
		
		 */
		int[][] score = new int[3][2];
		// 3행 2열 배열
		// 첨자 0
		score[0][0] = 100;
		score[0][1] = 100;
		
		score[1][0] = 100;
		score[1][1] = 100;
		
		score[2][0] = 100;
		score[2][1] = 100;
		
		//제어문 : for문
		//중첩 for
		for(int i=0; i<score.length; i++ ) {
			for (int j=0; j<score[i].length; j++) { //score[i].length 이해하기 ... 
				System.out.printf("score[%d][%d][%d] \t", i, j, score[i][j]);
			}
			System.out.println();
		}
		
		int[][] score2 = new int[][] {{11,12},{13,14},{15,16}}; // 두번째 문법, 
		// 3행 2열 배열
		//
		// 개선된 for문으로 2차원배열 출력
		for (int[] sc1 : score2) {
			for (int sc2 : sc1) {
				System.out.println(sc2);
			}
		}
		
	}

}
