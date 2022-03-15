package com.inn.javaprogram;

public class SumOfArrayElement {
	public static void main(String[] args) {
       int sum=0;
       int a[]= {1,2,3,4,5};
       for(int i=0;i<a.length;i++) {
    	 sum=sum+a[i];  
       }
       System.out.println("Arrays Sum: "+sum);
	}
}
