import java.util.Stack;

public class Ex05_Stack_Queue {

	public static void main(String[] args) {
		// JAVA API 제공하는 클래스 
		
		//LIFO 
		Stack stack = new Stack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		// C, B, A 
		System.out.println(stack.empty());
//		System.out.println(stack.pop());
		
		// 동전케이스, 핸드폰 화면 (전환), 연탄 갈기 등등 .. 
	}

}
