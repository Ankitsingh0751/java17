
/*
class Employee
{
    private int no;
    private String name;
    employee()
    { 
        System.out.println("Constructor");
    }
    employee(int id,String name)
    {
        this.no=id;
        this.name=name;
    }
    public void getValue()
    {
        System.out.println(eno+ " " +name);
    }
}

public class Test
{
    public static void main(String args[])
    {
        employee s=new employee(101,"SFSF");
        s.getValue();
        employee s1=new employee(102,"DFDF");
        s1.getValue();
        employee s2=new employee(103,"SFSFD");
        s2.getValue();
    }
}

[11:42] ParthM Patel
class Employee
{
        private int eno;
        private String ename;
        Employee(int id,String name){
            eno=id;
            ename=name;
        }
        void getValue(){
            System.out.println(eno+" "+ename);
        }

}

public class prg1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("hello world");
        Employee e1=new Employee(1,"aaaaa");
        Employee e2=new Employee(2,"bbbbb");
        Employee e3=new Employee(3,"ccccc");
        e1.getValue();
        e2.getValue();
        e3.getValue();
    }
}

*/

//This operator




//overloading
class Employee
{
	private int eno;
	private String ename;
	
	public void getValue(int eno)
	{
		this.eno = eno;
		System.out.println(eno);
	}
	public void getValue(String ename)
	{
		this.ename = ename;
		System.out.println(ename);
	}
	public void getValue(int eno, String ename){
		this.eno = eno;
		this.ename = ename;
		System.out.println(eno+ " "+ename);
	}
	
}

public class employee{
	public static void main(String[] args) {
		Employee s = new Employee();
		s.getValue(100);
		s.getValue("Ankit");
		s.getValue(200,"ANIII");
	}
}


//FINAL keyword, blank final variable

class Employee{
	final private int eno = 10; //const
	private String ename;
}





//