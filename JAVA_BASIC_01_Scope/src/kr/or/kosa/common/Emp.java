package kr.or.kosa.common;

// 사용자의 데이터를 담는 클래스
// VO, DTO, DOMAIN
// 사원 1명의 데이터를 담을 수 있는 클래스 
// 사원 1명 생성 : Emp emp = new Emp(7788, "홍길동". "IT", 300);
// emp.getEname(); 호출하면
// 홍길동님 이라는 데이터가 출력
// 어노테이션이 70% -> 쓰는 이유 생산성, 유지보수 때문
public class Emp {
	private int empno;
	private String enmae;
	private String job;
	private int sal; 
	
	public Emp(int empno, String enmae, String job, int sal) { // 생성자
		super();
		this.empno = empno;
		this.enmae = enmae;
		this.job = job;
		this.sal = sal;
	}
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	public String getEnmae() {
		return enmae;
	}
	public void setEnmae(String enmae) {
		this.enmae = enmae;
	}
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", enmae=" + enmae + ", job=" + job + ", sal=" + sal + "]";
	}

	
	
}
