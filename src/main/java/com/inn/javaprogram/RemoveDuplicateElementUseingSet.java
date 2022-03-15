package com.inn.javaprogram;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementUseingSet {
   public static void main(String[] args) {
	int a[]= {10,10,1,2,2,2};
	int n=a.length;
	removeElement(a,n);
}

private static void removeElement(int[] a, int n) {
	Set<Integer> listint=new HashSet<>();
	for(int i=0;i<n;i++) {
		listint.add(a[i]);	
	}
	System.out.print(listint);
}
}
