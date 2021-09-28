package com.CollectionFramework;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CFTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a tree map
		   TreeMap<String,String> tree_map=new TreeMap<String,String>();      
		  // Put elements to the map 
		  tree_map.put("C1", "Red");
		  tree_map.put("C2", "Green");
		  tree_map.put("C3", "Black");
		  tree_map.put("C4", "White");
		 
		    
		   for (Map.Entry<String,String> entry : tree_map.entrySet())
		   {
		    System.out.println(entry.getKey() + "=>" + entry.getValue());
		   }
		   
		 //  https://www.w3resource.com/java-exercises/collection/index.php#arraylist
		   System.out.println(tree_map);
	        if(tree_map.containsKey("C1")){
	            System.out.println("The Tree Map contains key C1");
	        } else {
	            System.out.println("The Tree Map does not contain key C1");
	        }
	        if(tree_map.containsKey("C5")){
	            System.out.println("The Tree Map contains key C5");
	        } else {
	            System.out.println("The TreeMap does not contain key C5");
	        }
		   //to search a value in a Tree Map.
	        if(tree_map.containsValue("Green")){
	            System.out.println("The TreeMap contains value Green");
	        } else {
	            System.out.println("The TreeMap does not contain value Green");
	        }
	        if(tree_map.containsValue("Pink")){
	            System.out.println("The TreeMap contains value Pink");
	        } else {
	            System.out.println("The TreeMap does not contain value Pink");
	        }
	        //to get all keys from the given a Tree Map.
	        Set<String> keys = tree_map.keySet();
	        for(String key: keys){
	            System.out.println(key);
	        }
		   //to delete all elements from a given Tree Map.
	       // System.out.println("Orginal TreeMap content: "+tree_map);
	        //tree_map.clear();
	        //System.out.println("The New map: "+tree_map);
	        //to get a key-value mapping associated with the greatest key and the least key in a map.
	        System.out.println("Orginal TreeMap content: " + tree_map);
	        System.out.println("Greatest key: " + tree_map.firstEntry());
	        System.out.println("Least key: " + tree_map.lastEntry());
	        // to get the first (lowest) key and the last (highest) key currently in a map.
	        System.out.println("Orginal TreeMap content: " + tree_map);
	        System.out.println("Greatest key: " + tree_map.firstKey());
	        System.out.println("Least key: " + tree_map.lastKey());
	        // to get a reverse order view of the keys contained in a given map.
	        System.out.println("Orginal TreeMap content: " + tree_map);
	        System.out.println("Reverse order view of the keys: " + tree_map.descendingKeySet());
	}
	        
	}

	 // to sort keys in Tree Map by using comparator.
class sort_key implements Comparator<String>{
    public int compare(String str1, String str2) {
       return str1.compareTo(str2);
   }
    
}
