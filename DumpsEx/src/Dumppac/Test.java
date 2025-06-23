package Dumppac;

enum Status{
	BRONZE(5), SILVER(10), GOLD(15);

	void Test(int i) {
		// TODO Auto-generated constructor stub
	}
	private int rate;
	private Status(int rate) {
		this.rate = rate;
	}
	public int getRate() {return rate; }
	public Status addStatus(int rate) {
		return new Status(20);
	}
	
}


void Status(int i) {
		// TODO Auto-generated constructor stub
	}


public  class Test{
	public static void main(String[] args) {
		Status silver = Status.SILVER;
		System.out.println(silver+silver.getRate());
		Status platinum =Status.addStatus(20);
		System.out.println(platinum+platinum.getRate());
	}
}

