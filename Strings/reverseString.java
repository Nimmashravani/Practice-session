package Strings;

public class reverseString {
public static void main(String[] agrs) {
	String s="hello";
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
System.out.println("my string before rev is:"+s);
System.out.println("my rev string is:"+rev);
}
}
