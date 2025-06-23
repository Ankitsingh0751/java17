package demo;

import javax.persistence.*;

@Entity
@Table(name="prod_det")
public class ProductInfo{

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int pid;
@Column(name="name")
private String pname;
@Column
private int price;

public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getName() {
	return pname;
}
public void setName(String pname) {
	this.pname = pname;
}
public int getPrice() {
	return price;

}
public void setPrice(int price) {
	this.price = price;
}



}