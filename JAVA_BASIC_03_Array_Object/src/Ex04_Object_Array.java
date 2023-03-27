
class Person {
	String name;
	int age;
	
	// 만약 사람 만들 때 이름, 나이, 강제하고 싶으면
	//Person() {}
	//Person(String name, int age) { this.name = name; this.age = age; }
	void print() {
		System.out.println(this.name + " : " + this.age);
	}
}

public class Ex04_Object_Array {

	public static void main(String[] args) {
		int[] intarr = new int[10];
		boolean[] boolarr = new boolean[5]; // false (default)
		
		Person p = new Person(); // local 참조 변수 p >> p라는 변수는 주소값을 가진다
		p.name = "홍길동";
		p.age = 100;
		
		// Person 타입의 사람 3명을 만드세요 
		// heap 객체를 3개
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		
		// int i, int j, int k => 랑 똑같음 
		Person[] persons = new Person[3]; // 방만 만들고 방에 아무도 살지 않아요 Person 타입이 오는 방 
		System.out.println(persons);
		System.out.println(persons[0]);
		System.out.println(persons[1]);
		System.out.println(persons[2]);
		
		// 방이 비어있어요
		persons[0] = new Person(); // 방은 주소값을 갖는다
		
		Person p5 = new Person();
		persons[1] = p5;
		
		persons[2] = new Person(); // 주소값 2번칸으로 넘어감 
		
		persons[2].name = "김유신"; // 그 2번칸의 객체에 name, age 설정해줌 
		persons[2].age = 100;
		
		System.out.println(persons[2].name);
		System.out.println(persons[2].age);
		
		// 초급자
		// 객체 배열은 방을 만드는 것과 방을 채우는 작업은 별개다 *********
		
		// 객체 배열은 ... 방 만들기 1, 방 주소로 채우기 2번으로 구성 
		
		// 객체 배열 3가지 방법 ... 
		// 1. int[] arr = new int[10]
		Person[] parray = new Person[10]; // 방만 만들었어요 방에 default 값 null
		// parry[0] >> null 이 있어요
		// 방에 들어갈 주소도 만들어야 합니다 (Person 타입과 동일)
		for (int i=0; i<parray.length; i++) {
			parray[i] = new Person();
			System.out.println("주소값 : " + parray[i]); // 주소가 할당되었다 
		}
		
		/*
		주소값 : Person@27082746
		주소값 : Person@66133adc
		주소값 : Person@7bfcd12c
		주소값 : Person@42f30e0a
		주소값 : Person@24273305
		주소값 : Person@5b1d2887
		주소값 : Person@46f5f779
		주소값 : Person@1c2c22f3
		주소값 : Person@18e8568
		주소값 : Person@33e5ccce
		 */
		
		// 객체 배열은 두가지!!! 방 만들기, 방 채우기 
		
		
		// 2. int[] arr = new int[]{10,20,30}
		Person[] parray2 = new Person[] {new Person(), new Person(), new Person()}; // 생성자로 객체 배열 생성 가능
		
		// 3. int[] arr = {10,20,30}
		Person[] parray3 = {new Person(), new Person(), new Person()};
	}

}
