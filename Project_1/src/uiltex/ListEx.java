package uiltex;
import java.util.*;

/*
public class ListEx {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(10);
		l.add("Ankit");
		
		System.out.println(l);
		
		Iterator it =  l.iterator();  // used to extract the data
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}

*/

/*
public class ListEx {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(30);
		l.add(40);
		l.add(20);
		
		System.out.println(l);
		
		l.addFirst(50);
		System.out.println(l);
		
		ListIterator it = l.listIterator();
		while(it.hasNext())
		{
				System.out.println(it.next());
				System.out.println(it.hasPrevious());
				System.out.println(it.hasNext());
				System.out.println(it.previousIndex());
				System.out.println(it.nextIndex());
			}
	
		


//		Iterator it =  l.iterator();  // used to extract the data
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
	}

}

*/

/*
public class ListEx{
	public static void main(String[] args) {
		Map mp = new HashMap();
		
		mp.put(1,"Ankit");
		mp.put(2,"SAnkit");
		//mp.put(2,"Atul");
		mp.put(3,"SAnkit");
		System.out.println(mp);
		
		Set s = mp.entrySet();
		Iterator it = s.iterator();
		
		while(it.hasNext()) {
			Map.Entry me = (Map.Entry)it.next();
			//System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
		
		
	}
}

*/

public class ListEx{
	public static void main(String[] args) {
		System.out.println("How many records want to store");
		
		Scanner sc = new Scanner(System.in);
		int reg = sc.nextInt();
		
		List<Employee> l = new ArrayList<Employee>(); //generics  jdk1.5
		
		
		for(int i =0;i<reg;i++)
		{
			Employee e;
			int no = sc.nextInt();
			String name = sc.next();
			int sal = sc.nextInt();
			l.add(new Employee(no, name, sal));
			
			
		}
		//l.forEach(j)->System.out.println(j.eno+" "+j.ename+" "+j.salary));
		for(Employee em:l) {  //foreach or enhanced for loops jdk1.5
			if(em.getSalary()< 5000)
			{
			System.out.println(em.getEno());
			System.out.println(em.getEname());
			System.out.println(em.getSalary());
			}
		}
	}
}

//if we want to random insertion and removal is it better to use Linkedlist other than use ArrayList



/***
collection

list                set                        queue

* Linked List       HashSet                    PriorityQueue
* ArrayList         LinkedHashSet
*Vector             TreeSet-Sorted Set
*Stack




*   Map
*- HashMap
* - TreeMap
*  - LinkedHashMap
*  
*  
*  
*  Enumerator
*  Iterator
*  
*  
*  Collection (method)
*  - add()   -addAll()  -clear()   (some more predefind methods)
*/