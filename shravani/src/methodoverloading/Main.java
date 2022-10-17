package methodoverloading;

//overloading in static methods 

import java.io.*; 


public class Main { 

 public static int shrav(int a) { return 10; } 
 public static char shrav(int a, int b) { return 'a'; } 

 public static void main(String args[]) 
 { 
     System.out.println(shrav(1)); 
     System.out.println(shrav(1, 2)); 
 } 
} 