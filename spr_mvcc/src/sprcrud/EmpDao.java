package sprcrud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmpDao {
	
	JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) {
		this.template=template;
	}
	
	public int save(Emp e) {
		String sql="insert into empspr values("+e.getId()+",' "+e.getName()+"', "+e.getSalary()+",' "+e.getDesig()+"')";
		return template.update(sql);
	}
	
	public List listEmp() {
		return template.query("select * from empspr", new RowMapper<Emp>() {
			@Override
			public Emp mapRow(ResultSet rs, int rownum) throws SQLException{
				Emp e=new Emp();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getInt(3));
				e.setDesig(rs.getString(4));
				return e;
		}
	});
}

}