import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
HashMap<k, v> key, value도 Generic 사용 가능 

HashMap<String, String>
HashMap<Integer, String>
HashMap<String, Student> POINT

put("kglim", new Student());

*/
class ArrayTest{
	ArrayList<String[]> al = new ArrayList<>();
	
}


class Student {
	int kor;
	int math;
	int eng;
	String name;
	public Student(int kor, int math, int eng, String name) {
		super();
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.name = name;
	}
}

public class Ex13_Generic {
	public static void main(String[] args) {
		HashMap<String, String> sts = new HashMap<>();
		sts.put("A", "AAA");
		System.out.println(sts.get("A"));
		//실무에서 Map
		//학생의 성적 데이터
		//key(학번), value[국어, 영어, 수학] >> Array, Collection(ArrayList)
		
		HashMap<String, Student> smap = new HashMap<>();
		smap.put("hong", new Student(100, 90, 50, "홍길동"));
		smap.put("kim", new Student(50, 30, 50, "김유신"));
		
		Student sd = smap.get("kim");
		System.out.println(sd.kor + "/ " + sd.eng + "/ " + sd.math + "/ " + sd.name);
		
		ArrayTest at = new ArrayTest();
		String[] strarr = {"A","B","C"};
		at.al.add(strarr);
		
		//Tip
		Set set = smap.entrySet(); // Map (Key, value) 가공 >> key+"="+value
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		/*
		 hong=Student@27082746
		 kim=Student@66133adc
		 */
		
		//Tip
		//key, value
		// entrySet을 개선된 for을 사용하면 Map.Entry에 저장된 주소를 받을 수 있고 각각 getKey와 getValue의 값을 나누어받을 수 있게 된다.
		// class Entry {Object key, Object value}
		// Map {Entry[] elements} >> Map.Entry 타입지정 
		for(Map.Entry m : smap.entrySet()) {
			System.out.println(m.getKey() + " / " + m.getValue());
		}
	}
	
}
