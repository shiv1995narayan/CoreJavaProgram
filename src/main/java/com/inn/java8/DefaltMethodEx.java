package com.inn.java8;

interface A{
	public void m1();
	public void m2();
	default void m3() {
		System.out.println("m3()is a default method");
	}
	default void m4() {
		int a=10;
		int b=20;
		System.out.println("Sum of Two number:"+(a+b));
	}
}
public class DefaltMethodEx implements A{
	public void m1() {
		System.out.println("m1()is a ovveride  method");	
	}
	public void m2() {
		System.out.println("m2()is a ovveride  method");	
	}
	public static void main(String[] args) {
		DefaltMethodEx t=new DefaltMethodEx();
		t.m1();
		t.m2();
		t.m3();
		t.m4();
	}
}
