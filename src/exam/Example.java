package exam;

import java.util.List;

import dao.EmpDao;
import dto.Emp;

public class Example {

	public static void main(String[] args) {
		
		// GUI 이벤트 리스너
		EmpDao dao = new EmpDao();
		List<Emp> list = dao.getList();
	
//		Emp emp = new Emp();
//		emp.setEname("SMITH");
//		boolean result = dao.existEmp(emp);
//		 "SELECT COUNT(*) FROM emp WHERE ename="+emp.getEname()
		
		boolean exist = false;
		for(Emp e : list) {
			if("SMITH".equals(e.getEname())) {
				exist = true;
			}
			System.out.println(e.toString());
		}
		
	}
}
