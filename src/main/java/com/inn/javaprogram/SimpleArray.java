package com.inn.javaprogram;

import java.util.Scanner;

public class SimpleArray {
   public static void main(String args[]) {
	   int a[]=new int[5];
	   for(int i=0;i<a.length;i++) {
		   Scanner sc=new Scanner(System.in);
		   a[i]=sc.nextInt();
	   }
	   for(int i=0;i<a.length;i++) {
		   System.out.print(a[i]+" ");
	   }
	   
	  
   }
}
