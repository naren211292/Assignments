package com.assignments;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MyJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr = new int [] {1, 2, 3};
      System.out.println(arr[1]);
      
      String [] str = new String [] {"Test", "old"};
      System.out.println(str[1]+str[0]);
      
      List<String> linkList = new LinkedList<String>();
      linkList.add("Narayanan");
      linkList.add("Subramanian");
      linkList.add("Kannan");
      //linkList.remove("Kannan");
      linkList.add(1, "Athimoolam");
      
      System.out.println(linkList); 
      
      Set<String> newSet = new TreeSet<String>();
      newSet.add("One");
      newSet.add("Two");
      newSet.add("Three");
      
      System.out.println(newSet);
      
      Map<String, String> myMap = new LinkedHashMap<String, String>();
      myMap.put("one", "naren");
      myMap.put("two", "kannan");
      myMap.put("three", "Narayanan");
      myMap.remove("one");
      System.out.println(myMap);
      
      //List<Map<String, String>> list = new ArrayList<Map<String, String>>();
      //list.add(myMap);
      
      System.out.println(myMap.get("two"));
      
      int i = 35;
      int j = 23;
      System.out.println(i-j);
      
      
	}

}
