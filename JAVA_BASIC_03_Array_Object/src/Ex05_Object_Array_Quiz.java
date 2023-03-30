import kr.or.kosa.Emp;

public class Ex05_Object_Array_Quiz {

	public static void main(String[] args) {
		/*
		 1. 사원 3명을 만드세요
		 단 Array 사용하세요
		 사원의 정보
		 1000 , 홍길동
		 2000 , 김유신
		 3000 , 유관순 
		  
		 2. 개선된 for문 으로 사번 , 이름 모두 출력하세요
		 

		 */
		
		// 첫번째 방법 
		Emp[] emplist = new Emp[3];
		emplist[0] = new Emp(1000,"홍길동");
		emplist[1] = new Emp(2000,"김유신");
		emplist[2] = new Emp(3000,"유관순");
		
		for(int i = 0 ; i < emplist.length ; i++) {
			emplist[i].empInfoPrint();
		}
		
		///////////////////////////////////////////////////
		
		// 두번째 방법
		Emp[] emplist2 = new Emp[] {new Emp(1000,"홍길동"),new Emp(2000,"김유신"),new Emp(3000,"유관순")};
		for(Emp emp : emplist2) {
			emp.empInfoPrint();
		}
		
		//////////////////////////////////////////////////
		
		// 세번째 방법 
		Emp[] person = {new Emp(1000, "홍길동"), new Emp(2000, "김유신"), new Emp(3000, "유관순")};
		for (Emp p : person) {
			p.empInfoPrint();
		}
		
	}

}
