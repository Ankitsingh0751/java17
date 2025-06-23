package com.lti.queueex;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class QueueDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> d = new LinkedList<String>(); 
        //adding elements to the queue using different ways  
        d.add("Java"); // add to tail 
        d.addFirst("Pyhton"); //add to head
        d.addLast("C#"); //add to tail
        d.push("CCNA"); //add to head 
        d.offer("Jquery"); //add to tail
        d.offerFirst("HTML"); //add to head 
        d.offerLast("CSS"); //add to tail
        //printing the deque
        System.out.println("Elements in the Deque is \n"+ d + "\n");   
        // displaying iterator in reverse order 
        Iterator rev = d.descendingIterator();  
        System.out.println("Iterator in Reverse Order:"); 
        while (rev.hasNext()) 
            System.out.println("\t" + rev.next()); 
        // Peek method returns the head, without deleting it from the deque 
        System.out.println("Peek " + d.peek()); 
        System.out.println("After peek: " + d); 
        // returning last element without removing
        System.out.println("PeekLast"+ d.peekLast());
        // Poll returns the head of the queue, and removes it from the deque 
        System.out.println("Poll " + d.poll()); 
        System.out.println("After poll: " + d); 
        //checking if a specific element exists in the deque  
        System.out.println("Contains element 3: " + d.contains("Jquery"));
        //removing the first and last element. 
        d.removeFirst(); 
        d.removeLast(); 
        System.out.println("Deque after removing first and last elements: " + d);

	}

}
