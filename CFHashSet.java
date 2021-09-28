package com.CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CFHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a empty hash set
	     HashSet<String> h_set = new HashSet<String>();
	   // use add() method to add values in the hash set
	          h_set.add("Red");
	          h_set.add("Green");
	          h_set.add("Black");
	          h_set.add("White");
	          h_set.add("Pink");
	          h_set.add("Yellow");

	   // print the hash set
	   System.out.println("The Hash Set: " + h_set);
	// set Iterator 
	    Iterator<String> p = h_set.iterator();
	  // Iterate the hash set
	   while (p.hasNext()) {
	   System.out.println(p.next());
	   }
	   //to get the number of elements in a hash set.
	    System.out.println("Original Hash Set: " + h_set);
	  
	    System.out.println("Size of the Hash Set: " + h_set.size());
	    // Remove all elements
	    h_set.removeAll(h_set);
	    System.out.println("Hash Set after removing all the elements "+h_set);   
	    //to test a hash set is empty or not.
	    System.out.println("Checking the above array list is empty or not! "+h_set.isEmpty());
	    System.out.println("Remove all the elements from a Hash Set: ");
	    h_set.removeAll(h_set);
	    System.out.println("Hash Set after removing all the elements "+h_set);   
	    //to clone a hash set to another hash set.
	    System.out.println("Original Hash Set: " + h_set);
	    HashSet <String> new_h_set = new HashSet <String> ();
	          new_h_set = (HashSet)h_set.clone();
	          System.out.println("Cloned Hash Set: " + new_h_set);  
	          //to convert a hash set to an array.
	          // Creating an Array
	          String[] new_array = new String[h_set.size()];
	          h_set.toArray(new_array);
	     
	         // Displaying Array elements
	         System.out.println("Array elements: ");
	          for(String element : new_array){
	            System.out.println(element);
	          }
	            //to convert a hash set to a tree set.
	         // Create a TreeSet of HashSet elements
	            Set<String> tree_set = new TreeSet<String>(h_set);
	        
	            // Display TreeSet elements
	            System.out.println("TreeSet elements: ");
	            for(String element1 : tree_set){
	               System.out.println(element1);
	            }
	            //to convert a hash set to a List/ArrayList
	         // Create a List from HashSet elements
	            List<String> list = new ArrayList<String>(h_set);
	        
	            // Display ArrayList elements
	            System.out.println("ArrayList contains: "+ list);
	           
	}
	          

}

