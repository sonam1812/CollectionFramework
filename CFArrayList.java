package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CFArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  System.out.println(list_Strings);
		// Print the list
		  for (String element : list_Strings) {
			    System.out.println(element);
			    }
		// Now insert a color at the first and last position of the list
		  list_Strings.add(0, "Pink");
		  list_Strings.add(5, "Yellow");
		  // Print the list
		  System.out.println(list_Strings);
		// Retrive the first and third element
		  String element = list_Strings.get(0);
		  System.out.println("First element: "+element);
		  element = list_Strings.get(2);
		  System.out.println("Third element: "+element);
		// Update the third element with "Yellow"
		  list_Strings.set(2, "Yellow");
		   // Print the list again
		  System.out.println(list_Strings);
		// Remove the third element from the list.
		  list_Strings.remove(2);
		  // Print the list again
		  System.out.println("After removing third element from the list:\n"+list_Strings);
		// Search the value Red
		    if (list_Strings.contains("Red")) {
		    System.out.println("Found the element");
		    } else {
		    System.out.println("There is no such element");
		    }
		    //sort array list
		    System.out.println("List before sort: "+list_Strings);
		    Collections.sort(list_Strings);
		    System.out.println("List after sort: "+list_Strings);  
		    //shuffling element
		    System.out.println("List before shuffling:\n" + list_Strings);  
		    Collections.shuffle(list_Strings);
		    System.out.println("List after shuffling:\n" + list_Strings); 
		    //reversing element
		    System.out.println("List before reversing :\n" + list_Strings);  
		    Collections.reverse(list_Strings);
		    System.out.println("List after reversing :\n" + list_Strings);
		    //to extract a portion of a array list
		    System.out.println("Original list: " + list_Strings);
		    List<String> sub_List = list_Strings.subList(0, 3);
		    System.out.println("List of first three elements: " + sub_List);
		    // to compare two array lists
		    ArrayList<String> c1= new ArrayList<String>();
	          c1.add("Red");
	          c1.add("Green");
	          c1.add("Black");
	          c1.add("White");
	          c1.add("Pink");

	          ArrayList<String> c2= new ArrayList<String>();
	          c2.add("Red");
	          c2.add("Green");
	          c2.add("Black");
	          c2.add("Pink");

	          //Storing the comparison output in ArrayList<String>
	          ArrayList<String> c3 = new ArrayList<String>();
	          for (String e : c1) {
	             c3.add(c2.contains(e) ? "Yes" : "No");
	          System.out.println(c3);
	          }
	        //Swapping 1st(index 0) element with the 3rd(index 2) element
	          Collections.swap(c1, 0, 2);
	           System.out.println("Array list after swap:");
	           for(String b: c1){
	           System.out.println(b);
	          }
	         //Swapping 1st(index 0) element with the 3rd(index 2) element
	           Collections.swap(c1, 0, 2);
	            System.out.println("Array list after swap:");
	            for(String b: c1){
	            System.out.println(b);  
	            }
	
	}
}
