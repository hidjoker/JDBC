package exam;

import java.util.List;

import dao.EmpDaoA;
import dto.Emp;

public class Ex {
	public static void main(String[] args) {
		EmpDaoA dao = new EmpDaoA();
		
		List<Emp> l = dao.getList();
		System.out.println(l);
		
	}
}
