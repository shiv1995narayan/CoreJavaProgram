package com.inn.java8;

import java.util.function.Function;
// Function<Input type,OutPut typr>
//Function<String,Integer>  means given a string "shiv"====>length=5
public class Functional_Interface_Ex1 {
   public static void main(String[] args) {
	//Function<Integer,Integer>f=i->i*i;
	  Function<String,String>f=s->s.toUpperCase();
	System.out.println(f.apply("shiv mewada"));
}
}
