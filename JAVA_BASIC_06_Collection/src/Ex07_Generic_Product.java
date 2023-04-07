import java.util.ArrayList;
import java.util.List;

import kr.or.kosa.CopyEmp;
import kr.or.kosa.Emp;

class Product {
	int price;
	int bonuspoint;
	
	// Product(){}
	public Product(int price) {
		this.price = price;
		this.bonuspoint = (int)(this.price/10.0);
	}
}

class KtTv extends Product{
	KtTv(){
		super(500);
	}
	
	@Override
	public String toString() {
		return "KtTv";
	}
}

class Audio extends Product{
	Audio(){
		super(100);
	}
	
	@Override
	public String toString() {
		return "Audio";
	}
}

class NoteBook extends Product{
	NoteBook(){
		super(150);
	}
	
	@Override
	public String toString() {
		return "NoteBook";
	}
}

public class Ex07_Generic_Product {

	public static void main(String[] args) {
		// 1. Array 사용해서 객체 생성
		// KtTv, Audio, NoteBook을 담을 수 있는 Cart 만드세요 
		Product[] cart = new Product[3];
		cart[0] = new KtTv();
		cart[1] = new Audio();
		cart[2] = new NoteBook();
		// 단점 : 배열의 크기가 고정 
		
		// 2. ArrayList 를 사용해서 Cart를 만드세요
		List<Product> pcart = new ArrayList<>();
		pcart.add(new KtTv());
		pcart.add(new KtTv());
		pcart.add(new KtTv());
		pcart.add(new KtTv());
		pcart.add(new NoteBook());
		// 동적으로 추가, 삭제 
		
		for (Product product : pcart) {
			System.out.println(product);
		}
		
		//Emp
		//3. ArrayList를 사용해서 사원 3명을 만드세요
		List<Emp> empList = new ArrayList<>();
		empList.add(new Emp(1001, "예진", "개발자"));
		empList.add(new Emp(1002, "예진진", "개발자"));
		empList.add(new Emp(1003, "예진진진", "개발자"));
		
		// 3.1 사원의 정보를 toString() 사용하지 말고 사번, 이름, 직종을 출력하세요 
		// 개선된 for문
		
		for (Emp emp : empList) {
			System.out.println(emp.getEmpno() + emp.getEname() + emp.getJob());
		}
		
		// 3.2 3.1과 동일한데 일반 for문 사용해서 사번, 이름, 직종을 출력하세요
		for (int i=0; i<empList.size(); i++) {
			System.out.println(empList.get(i).getEmpno() + empList.get(i).getEname() + empList.get(i).getJob());
		}
		
		// ArrayList 사용해서 사원 3명을 만드세요 (CopyEmp)
		// CopyEmp(100, "김씨", 1000)
		// CopyEmp(200, "박씨", 2000)
		// CopyEmp(300, "이씨", 3000)
		List<CopyEmp> copyEmpList = new ArrayList<>();
		copyEmpList.add(new CopyEmp(100, "김씨", 1000));
		copyEmpList.add(new CopyEmp(200, "박씨", 2000));
		copyEmpList.add(new CopyEmp(300, "이씨", 3000));
		
		// 4.1 200번 사원의 급여를 6000으로 수정하세요 (일반 for문을 통해서) getter, setter
		for (int i=0; i<copyEmpList.size(); i++) {
			if (copyEmpList.get(i).getEmpno() == 200) {
				copyEmpList.get(i).setSal(6000);
			}
		}
		
		// 4.2 300번 사원의 이름을 박씨에서 "궁금해씨" 수정해서 그 결과를 출력하세요 (개선된 for)
		for (CopyEmp copyEmp : copyEmpList) {
			if (copyEmp.getEmpno() == 300) {
				copyEmp.setEname("궁금해씨");
			}
			System.out.println(copyEmp);
		}
	}

}
