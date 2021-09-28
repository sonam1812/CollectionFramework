package com.CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class VFPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PriorityQueue<String> queue=new PriorityQueue<String>();  
		  queue.add("Red");
		  queue.add("Green");
		  queue.add("Orange");
		  queue.add("White");
		  queue.add("Black");
		  System.out.println("Elements of the Priority Queue: ");
		  System.out.println(queue);
		  //  to iterate through all elements in priority queue
		// iterate the Priority Queue
		  for (String element : queue) {
		    System.out.println(element);
		  }
	//to insert a given element into a priority queue.
		 // Inserts the specified element into this priority queue.
		    queue.offer("Blue");
		 
		    System.out.println("The New Priority Queue: " + queue);
	// to remove all the elements from a priority queue.
		    // Removing all the elements from the Priority Queue
		   // queue.clear();
		 
		   // System.out.println("The New Priority Queue: " + queue);
		    // to count the number of elements in a priority queue.
		    System.out.println("Size of the Priority Queue: " +queue.size());
		    //to retrieve the first element of the priority queue.
		    System.out.println("The first element of the Queue: "+queue.peek());
		    //to retrieve and remove the first element.
		    System.out.println("Removes the first element: "+queue.poll());
		    System.out.println("Priority Queue after removing first element: "+queue);
		   // to convert a priority queue to an array containing all of the elements of the queue.
		  //Convert a linked list to array list    
		    List<String> array_list = new ArrayList<String>(queue);
		    System.out.println("Array containing all of the elements in the queue: "+array_list);
		    
		  // to convert a Priority Queue elements to a string representation.
		  //Convert Priority Queue to a string representation
		    String str1;
		    str1 = queue.toString();
		    System.out.println("String representation of the Priority Queue: "+str1);   
		    
		    
	}
}
