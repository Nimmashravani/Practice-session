package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
	 public static void main(String args[]){  
		  //Creating a list of fruits  
		  List<String> list=new ArrayList<String>();  
		  list.add("Mango");  
		  list.add("Apple");  
		  list.add("Banana");  
		  list.add("Grapes");  
		  //Sorting the list  
		  Collections.sort(list);  
		   //Traversing list through the for-each loop  
		  for(String fruit:list)  
		    System.out.println(fruit);
	 }
}