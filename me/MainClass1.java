package com.Abstract.me;
abstract class Demo
{
	abstract public void test();
	
}
class Sample extends Demo
{
	public void test() {
		System.out.println("test is completed");
	}
}
class MainClass1
{
	public static void main(String[] args) {
		System.out.println("main starts");
		Sample s1=new Sample();
		s1.test();
		System.out.println("main starts");
	
	}
}