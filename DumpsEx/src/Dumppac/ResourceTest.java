package Dumppac;



public class ResourceTest {
	public static void main(String[] args) {
		final MyResource res1 = new MyResource();
		MyResource res2 = new MyResource();
		try(res1; res2){
			//do something
		} catch(Exception e) {}
	}
	static class MyResource implements AutoCloseable{
		public void close() throws Exception{}
	}
	
}
