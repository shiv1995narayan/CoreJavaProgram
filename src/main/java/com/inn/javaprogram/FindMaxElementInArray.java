package com.inn.javaprogram;

public class FindMaxElementInArray {
   public static void main(String[] args) {
   int a[]= {10,30,6,9};
   int max=0;
   int min=a[0];
   for(int i=0;i<a.length;i++){
	  if(max<a[i]) {
		  max=a[i];
	  }
	  if(min>a[i]) {
		  min=a[i];
	  }
   }
   System.out.println("Maximum element array :"+max);
   System.out.println("MINmum element array :"+min);
}
}
