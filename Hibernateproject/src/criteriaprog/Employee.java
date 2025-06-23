package criteriaprog;

import javax.persistence.*;


@Entity
@Table(name="Emp_info")
public class Employee {
	
		@Id 
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		private String fname;
		private String lname;
		private int sal;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public int getSal() {
			return sal;
		}
		public void setSal(int sal) {
			this.sal = sal;
		}
		public Employee(String fname, String lname, int sal) {
			super();
			this.fname = fname;
			this.lname = lname;
			this.sal = sal;
		}
		
		public Employee() {
			super();
		}
		public Employee(int id2, String fname2, int salary) {
			// TODO Auto-generated constructor stub
		}
		

}
