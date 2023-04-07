import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
Map 인터페이스
(key, value) 쌍의 구조를 갖는 배열
ex) 지역번호 (02, 서울) (031, 경기) 

key 중복(x) >> Set 인터페이스로 확장 가능, 중복이 안된다는 점에서 
value 중복(o) >> list랑 비슷하게 확장 가능, 중복이 되고 순서가 있다는 점에서 

Generic 작동
Map 인터페이스 구현하는 클래스 : 동기화(Tread: stack 여러개 사용하기)
구버전 : HashTable (동기화) 보장 : 한강 화장실 (Lock) 자원 보호 목적  
신버전 : HashMap (동기화) 보장하지 않아요 : 한강 비빔밥 (성능)  *****************중요 

ArrayList, HashMap + Generic >> 기본적인 CRUD >>  DB


 */
public class Ex11_Map_Interface {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("Tiger", "1004"); // id, pwd
		map.put("scott", "1004"); 
		map.put("Superman", "1007");
		
		System.out.println(map.containsKey("tiger")); // false 대소문자 구별 
		System.out.println(map.containsKey("scott")); // true 대소문자 구별 
		System.out.println(map.containsValue("1004")); // true 대소문자 구별 
		
		
		//Key 제공 ... value 값
		System.out.println(map.get("Tiger")); // value 1004
		System.out.println(map.get("hong")); // null
		
		// 만약에
		System.out.println(map.size());
		map.put("Tiger", "1008"); // key 동일하면 value 치환 
		System.out.println(map.size());
		System.out.println(map.get("Tiger"));
		System.out.println(map.toString());
		
		Object value = map.remove("Superman");
		System.out.println("삭제된 value : "+ value);
		System.out.println(map.toString());
		
		//응용(이해)
		Set set = map.keySet();
		//KeySet() 함수는 Set 인터페이스를 구현하고 있는 객체를 생성하고 데이터 담아서
		// 그 주소 리턴 
		// 부모타입인 Set 인터페이스를 통해서 자식객체의 주소를 받을 수 있다 
		// 표준화된 출력
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Collection clist = map.values();
		System.out.println(clist.toString());
	}

}
