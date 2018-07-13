package dto;

import java.util.Date;

//+ DAO, Data Access Object
//	- DB에 접근하기 위한 객체
//+ DTO, Data Transmission Object
//	- DAO 가 DB를 사용해서 조회할 때 필요한 데이터
//	- DAO 가 DB에서 조회한 결과
//	- 데이터교환을 할 떄 묶어서 보내기 위해 필요한 클래스
//+ VO, Value Object
//	- 데이터 묶음
//	** VO 패턴 : 데이터의 전송을 객체 단위로 하자
//	// VO - 자바 빈즈
//	class User{
//		private String name;
//		private int age;
//		getter
//		setter

// Table의 컬럼명과 변수명을 동일하게 만든다
// 변수에 대한 getter, setter만 작성한다
// 추가 메소드는 작성하지 않는다
// (테스트용 toString() 정도는 괜찮음..)

public class Emp {

	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;
	
	@Override
	public String toString() {
		return "Emp (empno="+empno
				+", ename="+ename
				+", job="+job
				+", mgr="+mgr
				+", hiredate="+hiredate
				+", sal="+sal
				+", comm="+comm
				+", deptno="+deptno+")";
	}
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	
		
}
