
public class Ex03_Array_For {

	public static void main(String[] args) {
		/*
		 Today Point
		 for문 >> 합성된 for문, 개선된 for문 
		 JAVA : for (Type 변수명 : 배열 or collection) { 실행블럭 }
		 C# : for (Type 변수명 in 배열 or collection) { 실행블럭 }
		 JavaScript : for (Type 변수명 in 배열 or collection) { 실행블럭 }
		 
		 */
		int[] arr = {5,6,7,8,9};
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// 개선된
		for (int value : arr ) {
			System.out.println(value);
		}
		
		//
		String[] strarr = {"A", "B", "C", "D", "FFFFF"};
		for (String value : strarr ) { // 전체의 길이 같은 건 알 필요가 없다 
			System.out.println(value);
		}
	}
}
