import java.util.HashMap;
import java.util.Scanner;

public class Ex12_Map_Quiz {

	public static void main(String[] args) {
		/*
		 Map 사용하는 데이터 집합
		 지역변호, 우편번호, 회원가입(id,pwd)
		 */
		HashMap loginmap = new HashMap(); // 메모리에는 회원id, pwd 저장 
		loginmap.put("kim", "kim1004");
		loginmap.put("scott", "tiger");
		loginmap.put("lee", "kim1004");
		/*
		 우리 시스템은 회원가입한 회원의 id, pwd를 관리하고 있다 
		 로그인시 아이디와 비번을 확인해서 회원이라면 사이트 접속 가능 
		 
		 id(0), pwd(0) >> 회원님 방가        1
		 id(0), pwd(x) >> 비밀번호 입력 추가   2
		 
		 id(x), pwd(0)  >> 회원가입 유도 
		 id(x), pwd(x)  >> 회원가입 유도
		 
		 사용자로 부터 id, pwd 입력 받으세요
		 id는 공백제거, 소문자 변환 String 변수에 담아서 사용 
		 pwd 공백제거
		 id(0), pwd(0) >> 회원님 방가 방가 출력하고 while 탈출  
		 id(0), pwd(x) >> 비밀번호확인하세요 출력만 
		 
		 id(x), pwd(0)  >> 아이디가 맞지 않습니다 , 재입력하세요 
		 id(x), pwd(x)  >> 아이디가 맞지 않습니다 , 재입력하세요
		 
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("아이디를 입력해주세요.");
			String temp = sc.nextLine().trim().toLowerCase();
			
			if (loginmap.containsKey(temp)) {
				System.out.println("비밀번호를 입력해주세요.");
				String temp2 = sc.nextLine().trim();
				if (loginmap.get(temp).equals(temp2)) {
					System.out.println("회원님 방가방가");
					break;
				} else {
					System.out.println("비밀번호를 확인해주세요");
				}
			} else {
				System.out.println("아이디가 맞지 않습니다. 재입력하세요.");
			}
			
		}
	}

}
