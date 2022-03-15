package com.inn.recursionProg;

import java.util.Scanner;

public class RecursionProg_Fibonic {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number:");
	int n=sc.nextInt();
	System.out.println(fibo(n));
}

private static int fibo(int n) {
	if(n<2)
		return n;
	return fibo(n-1)+fibo(n-2);
	
}
}
