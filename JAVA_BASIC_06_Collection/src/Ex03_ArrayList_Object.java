import java.util.ArrayList;

import kr.or.kosa.Emp;

/*
객체 배열



 */
public class Ex03_ArrayList_Object {

	public static void main(String[] args) {
		//1. 사원 1명을 만드세요
		Emp emp = new Emp(1000, "김유신", "장군");
		System.out.println(emp.toString());
		
		//2. 사원 2명을 만드세요 (Array)
		Emp[] emplist = {new Emp(100,"김씨","영업"), new Emp(200, "박씨", "IT")};
		for (Emp e : emplist) {
			System.out.println(e.toString());
		}
		
		//3. ArrayList 사용해서
		ArrayList elist = new ArrayList();
		elist.add(new Emp(100,"김씨","영업"));
		elist.add(new Emp(200,"박씨","IT"));
		// 추가 입사
		elist.add(new Emp(300,"이씨","IT"));
		for (int i =0; i<elist.size(); i++) {
			System.out.println(elist.get(i).toString());
			System.out.println(elist.get(i));
		}
		
		//toString() 사용하지 말고 3명의 사원 정보를 출력하세요
		//hint) getter를 사용
		//ArrayList는 내부적으로 Object[] ... 관리 
		for (int i =0; i<elist.size(); i++) {
			Object obj = elist.get(i); // object 타입 
//			System.out.println(obj); // 재정의된 toString() 부름 
//			obj.getEmpno() // 못 부른다. 부모타입의 참조변수는 자식타입의 자원에 접근하지 못하기 때문. (재정의 제외)
//			자식타입으로 casting
			Emp e = (Emp) obj;
			System.out.println(e.getEmpno() + "/ " + e.getEname() + "/ " +  e.getJob());
//			System.out.println(((Emp) elist.get(i)).getEmpno() + " " + ((Emp) elist.get(i)).getEname() + ((Emp) elist.get(i)).getJob());
//			System.out.println(elist.get(i));
		} 
//		현업 개발자 (Object >> 필요 >> Downcasting >> 자식 접근) -> 우리가 매번 이렇게 해야해???ㅡㅡ
//		Object 쓰지 말자 >> 대신에 >> 타입 강제
//		타입 강제 (그 타입을 쓰게 하자) >> 데이터의 관리는 하나의 타입으로 >> 타입은 필요시에 사용 
//		Generic (제너릭) 
		ArrayList<Emp> list2 = new ArrayList<Emp>();
		list2.add(new Emp(1, "A", "IT"));
		for (Emp e2 : list2) {
			System.out.println(e2.getEmpno());
		}
	}

}
