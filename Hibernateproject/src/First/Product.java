package First;

import javax.persistence.*;


@Entity
@Table(name = "prod_det1")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int pid;
	
	@Column(name="name", length =20)
	private String pname;
	@Column
	private int price;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
