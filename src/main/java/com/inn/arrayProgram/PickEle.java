package com.inn.arrayProgram;

public class PickEle {
   public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int mid=0;
	for(int i=0;i<a.length-1;i++) {
		if(a[i]!=a[i+1]) {
			mid=i+1;
		}
	}
	System.out.println("index:"+mid);
	System.out.println("pick Ele:"+a[mid]);
}
}
