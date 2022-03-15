package com.inn.java8;
interface Ab{
	public static void m1() {
		System.out.println("static method is interface");
	}
}
public class StaticMethodinInterface {
   public static void main(String[] args) {
	   Ab.m1();
}
}
