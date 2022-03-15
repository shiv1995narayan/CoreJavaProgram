package com.inn.arrayProgram;

import java.util.Scanner;

public class PickElementInArray_Print_Index {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Array Size:");
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Array Pick Element idex:"+Arraysort(arr,n));
}

private static int Arraysort(int[] arr,int n) {
	int i=0;
	int j=n-1;
	if(n==1) {
		return 0;
	}
	while(i<j) {
		int mid=(i+j)/2;
		if(arr[mid]<arr[mid+1]) {
			i=mid+1;
		}
		else {
			j=mid;
		}
		
	}
	return j;
}
}
