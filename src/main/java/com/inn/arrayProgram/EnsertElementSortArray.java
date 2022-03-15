package com.inn.arrayProgram;

public class EnsertElementSortArray {
   public static void main(String[] args) {
	
	int arr[]= {1,2,3,4,5};
	int n = arr.length; 
	int a[]=new int[n+1];
	
	int x=6;
	for(int i=0;i<n;i++) {
		a[i]=arr[i];
	}
	a[n]=x;
	for(int i=0;i<n;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println(a.length);
	System.out.println(arr.length);
	
}
}
