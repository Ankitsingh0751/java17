package jdbctemp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class StudentMapper implements RowMapper {
	
	@Override
	public Student mapRow(ResultSet res, int rnum) throws SQLException{
		
		Student st = new Student();
		st.setId(res.getInt(101));
		st.setName(res.getString(2));
		st.setCourse(res.getString(3));
		return st;
	}

	
}
