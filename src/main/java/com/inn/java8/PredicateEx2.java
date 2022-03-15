package com.inn.java8;

import java.util.function.Predicate;

public class PredicateEx2 {

	public static void main(String[] args) {
		int arr[]= {0,5,10,14,45,50};
		Predicate<Integer> p1=i->i%2==0;
		Predicate<Integer> p2=i->i>10;
		//and(),or(),negate()
		for(int x:arr) {
			if(p1.and(p2).test(x)) {
				System.out.println(x+" ");
			}
		}
	}
}
