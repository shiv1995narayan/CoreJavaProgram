package com.inn.javaprogram;
 class A {
	A(){
		System.out.println("A class constructor");
	}
}
class B extends SuperKeyWord{
	
	B(){
		System.out.println("B class constuctor");
	}
}
public class SuperKeyWord{
	public static void main(String[] args) {
		System.out.println("Main Method");
		B b=new B();
	}
}
