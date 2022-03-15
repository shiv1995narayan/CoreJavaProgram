package com.inn.recursionProg;

import java.util.Scanner;

public class fibonicSerices {
static int n1=0,n2=1,n3=0;    
private static void fibonic(int n) {

	if(n>0) {
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(" "+n3);
		fibonic(n-1);
	}

}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	System.out.print(" "+n1+" "+n2);
	fibonic(n-2);
}
}
