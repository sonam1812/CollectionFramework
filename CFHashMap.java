package com.CollectionFramework;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CFHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		  hash_map.put(1, "Red");
		  hash_map.put(2, "Green");
		  hash_map.put(3, "Black");
		  hash_map.put(4, "White");
		  hash_map.put(5, "Blue");
		  for(Entry<Integer, String> x:hash_map.entrySet()){  
		   System.out.println(x.getKey()+" "+x.getValue());  
		  }  
		  //to count the number of key-value (size) mappings in a map.
		  System.out.println("Size of the hash map: "+hash_map.size());
		  //to remove all the mappings from a map.
		// Removing all the elements from the linked map
		  //hash_map.clear();
		 // System.out.println("The New map: " + hash_map);
		  //to check whether a map contains key-value mappings (empty) or not.
		// check if map is empty
		  boolean result = hash_map.isEmpty();
		  // check the result
		  System.out.println("Is hash map empty: " + result);
		  // to get a shallow copy of a HashMap instance.
		  // print the map
		   System.out.println("The Original map: " + hash_map);
		   HashMap<Integer,String> new_hash_map= new HashMap<Integer,String>(); 
		   new_hash_map = (HashMap)hash_map.clone();     
		   System.out.println("Cloned map: " + new_hash_map);  
		   //to test if a map contains a mapping for the specified key.
		   System.out.println("1. Is key 'Green' exists?");
		   if (hash_map.containsKey("Green")) {
		    //key exists
		    System.out.println("yes! - " + hash_map.get("Green"));
		   } else {
		    //key does not exists
		    System.out.println("no!");
		   }

		   System.out.println("\n2. Is key 'orange' exists?");
		   if (hash_map.containsKey("orange")) {
		    System.out.println("yes! - " + hash_map.get("orange"));
		   } else {
		    System.out.println("no!");
		   }
		  //to test if a map contains a mapping for the specified value.
		   System.out.println("1. Is value \'Green\' exists?");
		   if (hash_map.containsValue("Green")) {
		    //value exists
		    System.out.println("Yes! ");
		   } else {
		    //value does not exists
		    System.out.println("no!");
		   }

		   System.out.println("\n2. Is value \'orange\' exists?");
		   if (hash_map.containsValue("orange")) {
		    System.out.println("yes! - " );
		   } else {
		    System.out.println("No!");
		   }
		   //to create a set view of the mappings contained in a map.
		// create set view for the map
		   Set set = hash_map.entrySet();
		   // check set values
		   System.out.println("Set values: " + set);
		   //to get the value of a specified key in a map.
		   // get value of key 3
		   String val=(String)hash_map.get(3); 
		   // check the value
		   System.out.println("Value for key 3 is: " + val);
		   // to get a set view of the keys contained in this map.
		   // get keyset value from map
		   Set keyset = hash_map.keySet();
		      
		  // check key set values
		   System.out.println("Key set values are: " + keyset);  
		   // to get a collection view of the values contained in this map.
		   // checking collection view of the map
		   System.out.println("Collection view is: "+ hash_map.values());
	}

}
