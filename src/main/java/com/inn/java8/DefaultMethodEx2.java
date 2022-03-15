package com.inn.java8;
interface left{
	default void m1() {
		System.out.println("left m1() method");
	}
}
interface right{
	default void m1() {
		System.out.println("right m1() method");
	}
}
public class DefaultMethodEx2 implements left,right{
  public void m1() {
	  left.super.m1();
	  right.super.m1();
  }
	public static void main(String[] args) {
	   DefaultMethodEx2 df=new DefaultMethodEx2();
	   df.m1();
	  
}
}
