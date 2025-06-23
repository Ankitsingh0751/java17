package jdbctemp;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao {
	
	private DataSource ds;
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void setDataSource(DataSource ds) {
		this.ds=ds;
		this.jdbcTemplate = new JdbcTemplate(ds);
		
	}

	
	@Override
	public List<Student> listStudent() {
		
		String str ="select * from Student";
		
		List<Student> stu=jdbcTemplate.query(str, new StudentMapper());
		
		return stu;
	}

	@Override
	public void create(int id, String name, String course) {
		String str="insert into student values(?,?,?)";
		
		
		Student s = new Student();
		Object[] input=new Object[] {id,name,course};
		jdbcTemplate.update(str,input);
	}
	
	@Override
	public void update(Integer id, String course) {
		String str="update studentdet set course=? where id=?";
		
		Object[] input=new Object[] {course,id};
		jdbcTemplate.update(str,input);
		
	}
	
	@Override
	public void delete(Integer id) {
		String str="delete from student where id=?";
		
		
		jdbcTemplate.update(str,id);
		
	}


	
	
	

}