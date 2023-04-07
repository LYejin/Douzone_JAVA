import java.util.ArrayList;
import java.util.List;

//교재 13장
/*
Today Point
jdk 1.5버전

C#, JAVA (필수기능)

1. 타입을 처음부터 강제
2. 타입 안정성(타입 강제)
3. 강제 형변환 필요 없다 ex) (Car) Object 이렇게 할 필요없어짐. 
 */
//설계도를 만들 때
class MyGeneric<T> { //Type parameter
	T obj;
	
	void add(T obj) {
		this.obj = obj;
	}
	T get() {
		return this.obj;
	}
}

class Person{
	int age = 100;
}

public class Ex04_Generic {

	public static void main(String[] args) {
		MyGeneric<String> mygen = new MyGeneric<String>();
		/*
		String obj;

		void add(String obj) {
			this.obj = obj;
		}
		String get() {
			return this.obj;
		}
		 */
		mygen.add("문자열");
		String str = mygen.get();
		System.out.println(str);
		
		ArrayList list = new ArrayList();
		list.add(10);
		list.add("홍길동");
		list.add(new Person());
		
		//개선된 for문 사용해서 Person객체는 age 값을 출력하고 나머지는 값을 출력 
		for(Object obj : list) {
//			System.out.println(obj);
			if(obj instanceof Person) {
				Person p = (Person) obj;
				System.out.println(p.age);
			} else {
				System.out.println(obj);
			}
		}
		
		List<Person> plist = new ArrayList<>();
		plist.add(new Person());
		plist.add(new Person());
		for (Person p : plist) {
			System.out.println(p.age);
		}
	}

}
