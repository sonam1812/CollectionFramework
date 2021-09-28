package com.CollectionFramework;

import java.util.SortedMap;
import java.util.TreeMap;

public class CFTreeMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	to get a key-value mapping associated with the greatest key less than or equal to the given key.
		 // Create a tree map
		  TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();
		  // Put elements to the map 
		  tree_map1.put(10, "Red");
		  tree_map1.put(20, "Green");
		  tree_map1.put(40, "Black");
		  tree_map1.put(50, "White");
		  tree_map1.put(60, "Pink");

		  System.out.println("Orginal TreeMap content: " + tree_map1);
		  System.out.println("Checking the entry for 10: ");
		  System.out.println("Value is: " + tree_map1.floorEntry(10));
		  System.out.println("Checking the entry for 30: ");
		  System.out.println("Value is: " + tree_map1.floorEntry(30));
		  System.out.println("Checking the entry for 70: ");
		  System.out.println("Value is: " + tree_map1.floorEntry(70));	
		
		//to get the greatest key less than or equal to the given key.
		  System.out.println("Orginal TreeMap content: " + tree_map1);
		  System.out.println("Checking the entry for 10: ");
		  System.out.println("Key is: " + tree_map1.floorKey(10));
		  System.out.println("Checking the entry for 30: ");
		  System.out.println("Key is: " + tree_map1.floorKey(30));
		  System.out.println("Checking the entry for 70: ");
		  System.out.println("Key is: " + tree_map1.floorKey(70));
		  
		  //to get the portion of a map whose keys are strictly less than a given key.
		  System.out.println("Orginal TreeMap content: " + tree_map1);
		  System.out.println("Checking the entry for 10: ");
		  System.out.println("Key(s): " + tree_map1.headMap(10));
		  System.out.println("Checking the entry for 30: ");
		  System.out.println("Key(s): " + tree_map1.headMap(30));
		  System.out.println("Checking the entry for 70: ");
		  System.out.println("Key(s): " + tree_map1.headMap(70));
		  
		  //to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.
		  System.out.println("Orginal TreeMap content: " + tree_map1);
		  System.out.println("Checking the entry for 10: ");
		  System.out.println("Key(s): " + tree_map1.headMap(10, true));
		  System.out.println("Checking the entry for 20: ");
		  System.out.println("Key(s): " + tree_map1.headMap(20, true));
		  System.out.println("Checking the entry for 70: ");
		  System.out.println("Key(s): " + tree_map1.headMap(70, true));
		
		  //to get the least key strictly greater than the given key. Return null if there is no such key.
		  System.out.println("Orginal TreeMap content: "+tree_map1);
		  System.out.println("Checking the entry for 10: ");
	      System.out.println("Key(s): "+tree_map1.higherEntry(10));  
		  System.out.println("Checking the entry for 20: ");
	      System.out.println("Key(s): "+tree_map1.higherEntry(20));  
		  System.out.println("Checking the entry for 70: ");
	      System.out.println("Key(s): "+tree_map1.higherEntry(70));  
	      
         //to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key.
	      System.out.println("Orginal TreeMap content: "+tree_map1);
		  System.out.println("Checking the entry for 10: ");
	      System.out.println("Key(s): "+tree_map1.lowerEntry(10));  
		  System.out.println("Checking the entry for 20: ");
	      System.out.println("Key(s): "+tree_map1.lowerEntry(20));  
		  System.out.println("Checking the entry for 70: ");
	      System.out.println("Key(s): "+tree_map1.lowerEntry(70));  
	      
	      // to get the greatest key strictly less than the given key. Return null if there is no such key.
	      System.out.println("Orginal TreeMap content: " + tree_map1);
	      System.out.println("Checking the entry for 10: ");
	      System.out.println("Key(s): " + tree_map1.lowerKey(10));
	      System.out.println("Checking the entry for 20: ");
	      System.out.println("Key(s): " + tree_map1.lowerKey(20));
	      System.out.println("Checking the entry for 70: ");
	      System.out.println("Key(s): " + tree_map1.lowerKey(70));
	      
	      //to get NavigableSet view of the keys contained in a map.
	      System.out.println("Orginal TreeMap content: " + tree_map1);
	      System.out.println("Orginal TreeMap content: " + tree_map1.navigableKeySet());
	      
	      //to remove and get a key-value mapping associated with the least key in a map.
	      // polling first entry
	      System.out.println("Value before poll: " + tree_map1);
	      System.out.println("Value returned: " + tree_map1.pollFirstEntry());
	      System.out.println("Value after poll: " + tree_map1);
	      
	      //  to remove and get a key-value mapping associated with the greatest key in this map.
	   // polling first entry
	      System.out.println("Value before poll: " + tree_map1);
	      System.out.println("Value returned: " + tree_map1.pollLastEntry());
	      System.out.println("Value after poll: " + tree_map1);
		  
	      // to get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive).
	      System.out.println("Orginal TreeMap content: " + tree_map1);
	      SortedMap<Integer, String> sub_tree_map = tree_map1.subMap(20, 40);
	      System.out.println("Sub map key-values: " + sub_tree_map);
	      
	      // to get the portion of a map whose keys range from a given key to another key.
	      System.out.println("Orginal TreeMap content: " + tree_map1);
	      sub_tree_map = tree_map1.subMap(20, true, 40, true);
	      System.out.println("Sub map key-values: " + sub_tree_map);
	      
	      //to get a portion of a map whose keys are greater than or equal to a given key.
	      System.out.println("Orginal TreeMap content: " + tree_map1);
	      System.out.println("Keys are greater than or equal to 20: " + tree_map1.tailMap(20));
	      
	      // to get a portion of a map whose keys are greater than to a given key.
	      System.out.println("Orginal TreeMap content: " + tree_map1);
	      System.out.println("Keys are greater than 20: " + tree_map1.tailMap(20, false));
	      
	      //to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.
	      System.out.println("Orginal TreeMap content: " + tree_map1);
	      System.out.println("Keys greater than or equal to 20: " + tree_map1.ceilingEntry(20));
	      System.out.println("Keys greater than or equal to 40: " + tree_map1.ceilingEntry(40));
	      System.out.println("Keys greater than or equal to 50: " + tree_map1.ceilingEntry(50));
	      
	      //to get the least key greater than or equal to the given key. Returns null if there is no such key.
	      System.out.println("Orginal TreeMap content: " + tree_map1);
	      System.out.println("Keys greater than or equal to 20: " + tree_map1.ceilingKey(20));
	      System.out.println("Keys greater than or equal to 30: " + tree_map1.ceilingKey(30));
	      System.out.println("Keys greater than or equal to 50: " + tree_map1.ceilingKey(50));
	}

}
