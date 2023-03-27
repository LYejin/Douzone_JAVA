
public class Ex02_Array_Quiz {

	public static void main(String[] args) {
		// 국문과 학생들의 기말고사 시험점수입니다
		int[] score = new int[] { 79, 88, 97, 54, 56, 95 };
		int max = score[0]; // max < 79
		int min = score[0]; // min < 79
		/*
		 * [제어문]을 통해서 max 라는 변수에 시험점수중에 최대값을 담고
			min 변수에 시험점수중에 최소값을 담으세요 
			출력결과 : max >>97 , min >> 54 단) for문을 한번만 사용하세요 (처음하시는 분 두번)
		 */
		
		for (int i = 1; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			}
			if (min > score[i]) {
				min = score[i];
			}
		}
		
		System.out.printf("max >> %d, min >> %d", max, min);
	}

}
