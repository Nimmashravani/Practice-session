package methodoverloading;
	import java.io.*;  
  
public class Test {  
  
   
    public static void main(String[] args)  
    {  
        System.out.println("Hi Shravani (from main)");  
        Test.main("Shravani");  
    }  
  
    // Overloaded main methods  
    public static void main(String arg1)  
    {  
        System.out.println("Hi, " + arg1);  
        Test.main("Dear Shravani", "good morning");  
    }  
    public static void main(String arg1, String arg2)  
    {  
        System.out.println("Hi, " + arg1 + ", " + arg2);  
    }  
}  