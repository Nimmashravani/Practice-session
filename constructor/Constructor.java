package com.constructor;

public class Constructor {
public String gName;
public String gType;
public int bullets;
public Constructor (String n, int b, String t) {
	gName=n;
	bullets=b;
	gType=t;
}
	public void printGunData()
	{
		System.out.println("Gun type is: "+gType);
		System.out.println("No.Of Bullets is: "+bullets);
		System.out.println("Gun name is: "+gName);
	}
	}

class MainClass{
	public static void main(String[] args) {
		System.out.println("main starts");
		Constructor g1=new Constructor("AK47", 40, "mediumrange`");
		Constructor g2=new Constructor("AW", 5, "longrange`");
		g1.printGunData();
		g2.printGunData();
		System.out.println("main ends");
	}
}