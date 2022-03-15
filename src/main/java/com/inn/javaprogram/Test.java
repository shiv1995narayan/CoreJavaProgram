package com.inn.javaprogram;
interface intef{
	 static int x=10;
}
public class Test implements intef{
  public static void main(String[] args) {
	  Test t=new Test();
	  System.out.println(x);
}
}
