package com.CollectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class CFTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tree_set = new TreeSet<String>();
		  tree_set.add("Red");
		  tree_set.add("Green");
		  tree_set.add("Orange");
		  tree_set.add("White");
		  tree_set.add("Black");
		  System.out.println("Tree set: ");
		  System.out.println(tree_set);
		  //to create a reverse order view of the elements contained in a given tree set.
		  // print original list
		   System.out.println("Original tree set:" + tree_set);  
	Iterator it = tree_set.descendingIterator();
    // Print list elements in reverse order
    System.out.println("Elements in Reverse Order:");
    while (it.hasNext()) {
       System.out.println(it.next());
    }
    //to get the first and last elements in a tree set.
 // Find first element of the tree set
    Object first_element = tree_set.first();
    System.out.println("First Element is: "+first_element);
 
    // Find last element of the tree set
    Object last_element = tree_set.last();
    System.out.println("Last Element is: "+last_element);
    //to clone a tree set list to another tree set.
    TreeSet<String> new_t_set = (TreeSet<String>)tree_set.clone();
    System.out.println("Cloned tree list: " + tree_set);      
    //to get the number of elements in a tree set.
    System.out.println("Size of the tree set: " + tree_set.size());
    
}
}
