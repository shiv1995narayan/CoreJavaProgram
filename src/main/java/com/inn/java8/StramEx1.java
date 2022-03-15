package com.inn.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class StramEx1 {
   public static void main(String[] args) {
	ArrayList<Integer> l=new ArrayList<>();
	l.add(0);
	l.add(10);
	l.add(20);
	l.add(35);
	l.add(45);
	l.add(47);
	System.out.println(l);
	//java 1.7 version
	ArrayList<Integer> l1=new ArrayList<Integer>();
	for (Integer i : l) {
		if(i%2==0) {
			l1.add(i);
		}
	}
	System.out.println(l1);
	
	// java 1.8 v using Stram
	List<Integer> ll=l.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(l1);
}
}
