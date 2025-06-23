package jdbctemp;

import java.util.List;

import javax.sql.DataSource;

public interface StudentDao {

	void setDataSource(DataSource ds);
	List<Student> listStudent();
	//for create
	void create(int id,String name,String course);
	//for update
	public void update(Integer id, String course);
	
	//for delete.
	public void delete(Integer id);
	
	
}