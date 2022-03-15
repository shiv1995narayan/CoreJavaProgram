package com.inn.arrayProgram;

import java.util.Arrays;

public class MaxEleAndMinElem {
  public static void main(String[] args) {
	int arr[]={1, 345, 234, 21, 56789};
	Arrays.sort(arr);
		System.out.println("Min Ele :"+arr[0]);
		System.out.println("Max Ele :"+arr[arr.length-1]);
}
}
