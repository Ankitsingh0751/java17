package com.lti.queueex;

import java.util.LinkedList;
import java.util.Queue;

//insertion of a new element -> enqueuing
//retrieval and removal of the next element from the queue -> dequeuing. 
//to retrieve the next element from a queue without removing it from the queue-> peek
//For implementing queue, we need to keep track of two indices, front and rear. 
//We enqueue an item at the rear and dequeue an item from the front
public class QueuesDemo1 {
	public static void main(String[] args) {
		
		//As the Queue is an interface, it cannot be instantiated. We need some concrete classes to implement the functionality of the Queue interface.
		//Two classes implement the Queue interface i.e. LinkedList and PriorityQueue.
		
		Queue<Integer> q1 = new LinkedList<Integer>();
     //Add elements to the Queue
     q1.add(10);
     q1.add(20);
     q1.add(30);
     q1.add(40);
     q1.add(50);
     System.out.println("Elements in Queue:"+q1); //10  20 30 40 50 
     //remove () method =>removes first element from the queue
     System.out.println("Element removed from the queue: "+q1.remove()); //10
     //element() => returns head of the queue
     System.out.println("Head of the queue: "+q1.element());//20 
     System.out.println("Head of the queue: "+q1.element());//20 
     //poll () => removes and returns the head
     System.out.println("Poll():Returned Head of the queue: "+q1.poll()); //20 
     //returns head of the queue
     System.out.println("peek():Head of the queue: "+q1.peek());//30
     //print the contents of the Queue
     System.out.println("Final Queue:"+q1); // 30 40 50 
		
		 

	}

}

/*
These methods are:

peek()
element()
poll()
remove()

The peek() method retrieves the value of the first element of the queue without removing it from the queue. 
For each invocation of the method we always get the same value and its execution
does not affect the size of the queue. 
If the queue is empty the peek() method returns null.

The element() method behaves like peek(), so it again retrieves the value of the first element without removing it.
Unlike peek (), however,
if the list is empty element() throws a NoSuchElementException

The poll() method retrieves the value of the first element of the queue by removing it from the queue. .
At each invocation it removes the first element of the list and 

if the list is already empty it returns null but does not throw any exception
The remove() method behaves as the poll() method, 
so it removes the first element of the list and
if the list is empty it throws a NoSuchElementException
*/






