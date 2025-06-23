package RecapTest;


@interface SmartPhone
{
	String opSys();
}
@interface BasicPhone
{
	
}

@SmartPhone(opSys = "Android")
class SamsungMobile
{
	String model;
	int screensize;
	public SamsungMobile(String model, int screensize) {
		super();
		this.model = model;
		this.screensize = screensize;
	}
	
	
}
public class CustomAnnotation {
	public static void main(String[] args) {
		
	}

}
