package com.inn.recursionProg;

import java.util.Scanner;

public class FactorialNumber {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number:");
	int n=sc.nextInt();
	System.out.println(fact(n));
}

private static int fact(int n) {
	if(n==1||n==0)
	  return n;
	else {
		System.out.println("n==={}"+n);
		return n*fact(n-1);
	}
}
}
