package com.Abstract.me;
abstract class Demo1
{
	abstract public void walk();
	
}
abstract class Sample1 extends Demo1{
	
}
class Run1 extends Sample1{
	public void walk() {
		System.out.println("walk completed");
	}
}
 class MainClass2 {

	public static void main(String[] args) {
		System.out.println("main starts");Run1 r1=new Run1();
		r1.walk();
		System.out.println("main ends");
	}

}
