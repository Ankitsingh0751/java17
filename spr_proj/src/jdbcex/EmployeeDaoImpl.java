package jdbcex;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao{
	
	@Override
	public void insertEmp(Employee emp) {
		String str = "insert into emp values(?,?,?)";
		
		Object[] input = new Object[] {emp.getEid(),emp.getName(), emp.getEsal()};
		
		getJdbcTemplate().update(str,input);
	}
}
