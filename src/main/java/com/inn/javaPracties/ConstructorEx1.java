package com.inn.javaPracties;

public class ConstructorEx1 {
   public static void main(String[] args) {
	int a[]= {1,3,5,4,8};
	int n=a.length;
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(a[i]<a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int i=0;i<n;i++) {
		System.out.print(a[i]+" ");
	}
}
}
