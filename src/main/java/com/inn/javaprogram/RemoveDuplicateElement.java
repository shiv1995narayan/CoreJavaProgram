package com.inn.javaprogram;

import java.util.Arrays;

public class RemoveDuplicateElement {
	public static void main(String[] args) {
       int a[]= {1,1,2,2,2};
       Arrays.sort(a);
       int n=a.length;
      n =removeDuplicateElement(a,n);
      System.out.print("Array Element:");  
      for(int i=0;i<n;i++) {
    	  System.out.print(a[i]+" ");  
      }
       
	}

	private static int removeDuplicateElement(int[] a, int n) {
		if(n==0||n==1) {
			return n;
		}
		
		int temp[]=new int[n];
		int j=0;
		
		for(int i=0;i<n-1;i++) {
			if(a[i]!=a[i+1]) {
				temp[j++]=a[i];
			}
		}
		
		temp[j++]=a[n-1];
		for(int i=0;i<j;i++) {
			a[i]=temp[i];
		}
		return j;
	}
}
