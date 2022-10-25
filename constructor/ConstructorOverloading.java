package com.constructor;

public class ConstructorOverloading {

	public ConstructorOverloading() {
		System.out.println("constructor without arg");
	}
	public ConstructorOverloading(int i) {
		System.out.println("constructor with int  arg");
	}
	public ConstructorOverloading(boolean i) {
		System.out.println("constructor with boolean arg");
	}
	public ConstructorOverloading(double i, int j) {
		System.out.println("constructor with double, int arg");
	}
}
class MainClass1{
	public static void main(String[] args) {
		System.out.println("main starts");
		ConstructorOverloading c1=new ConstructorOverloading(3.4,12);
		ConstructorOverloading c2=new ConstructorOverloading();
		ConstructorOverloading c3=new ConstructorOverloading(true);
		ConstructorOverloading c4=new ConstructorOverloading(99);
		System.out.println("main ends");
	}

}
