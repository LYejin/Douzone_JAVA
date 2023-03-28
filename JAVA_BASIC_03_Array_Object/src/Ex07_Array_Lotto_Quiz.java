/*
1. 1~45 까지의 난수를 발생시켜서 6개의 정수값을 배열에 담으세요
2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안되요 (중복값 검증)

3. 배열에 있는 6개의 값은 낮은 순으로 정렬 시키세요(정렬 : 자리바꿈 : swap)

4. 위 결과를 담고있는 배열을 출력하세요

main 안에서 모두 작성하셔도 되고요
static 함수를 만들어 기능 나누는 것은 가능 (x)
별도의 Lotto.java 클래스는 생성하지 마세요 ....(x)
*/
public class Ex07_Array_Lotto_Quiz {

	public static void main(String[] args) {
		 
		int[] lotto = new int[6];
		 
		//중복값
		for(int i = 0 ; i < 6 ; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			//여기서 비교
			//[ ][ ][ ][ ][ ][ ]
			//[0][1][2][3][4][5]
			//만약에 0번째 방에 30 들어가면
			//1번째 방에 난수값 들어가기 전에 기존 방에 있는 값과 비교해서 
			//다시 추출
			//그런데 문제는 다시 추출시 for i는 이미 소비되어서 .... 반복 횟수가 줄어드는 문제 발생 
			for(int j = 0 ; j < i ; j++) { //j < i (채워진 개수 만큼 비교)
				//여기서 비교하면 어떨까요
				if(lotto[i] == lotto[j]) {
					//이러면 중복값은 해결되지만 소비된 i변수값으로 ...방을 채울수 없는 경우 발생하죠
					//여기의 POINT는 소비된 i 값을 다시 복원시키는 것이죠
					i--;
					break;
					
				}
			}
		}

		
		
		//정렬
		for(int i = 0 ; i < lotto.length ; i++) {
			for (int j=i+1; j<lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					int swap = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = swap;
				}
			}
		}
		
		for(int i = 0 ; i < lotto.length ; i++) {
			System.out.print(lotto[i] + "\t");
		}
		System.out.println();
	}

}


