
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
		System.out.println();
		System.out.println();
		
		/////////////////////////////////////////////////
		
		int[] numbers = new int[10];
		//10개의 방의 값을 1 ~ 10까지로 초기화하고 출력하세요
		
		int num = 0;
		
		for (int i=1; i<11; i++) {
			numbers[num] = i;
			num++;
		}
		
		// 출력 
		for (int i=0; i<10; i++) {
			System.out.print(numbers[i]);
		}
		System.out.println();
		
		//////////////////////////////////////////////////
		
		
		//어느 학생의 기말고사 시험점수 (5과목)
		int[] jumsu = {100,55,90,60,78};
		int sum = 0;
		float avg = 0f;
				
		//1. 총과목의 수
		System.out.println();
		System.out.println(jumsu.length + "과목");
		
		//2. 과목의 합
		System.out.println();
		for (int i=0; i<jumsu.length; i++) {
			sum += jumsu[i];
		}
		System.out.println("과목의 합 : " + sum);
		
		//3. 과목의 평균
		System.out.println();
//		for (int i=0; i<jumsu.length; i++) {
//			sum += jumsu[i];
//		}
		avg = (sum/jumsu.length);
		System.err.println("평균 : " + avg);
		
		
		//단 2,3문제는 하나의 for으로 해결
		
	}

}
