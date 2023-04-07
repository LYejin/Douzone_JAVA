package kr.or.kosa;

public class MyStack {
	private Object[] stackarr; //저장소
	private int top; // 배열의 index값 (위치정보)
	private int maxsize; // 최대 크기 // length
	
	public MyStack(int maxsize) {
		this.stackarr= new Object[maxsize];
		this.top = -1;
		this.maxsize = maxsize;
	}
	
	public boolean idEmpty() {
		return (top == -1);
	}
	
	public boolean isfull() {
		return (top == this.maxsize -1 );
	}
	
	public void push(Object i) {
		if (isfull()) {
			//throw new IndexOutOfBoundsException("예외발생");
			System.out.println("mystack full ...");
		} else {
			this.stackarr[++top] = i;
		}
	}
	
	public Object pop() {
		Object value = null;
		if (idEmpty()) {
			System.out.println("mystack empty");
		} else {
			value = stackarr[top];
			top--;
		}
		return value;
	}
}
