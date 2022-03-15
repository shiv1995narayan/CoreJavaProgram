package com.inn.arrayProgram;

public class FindAccurenceEle {
	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 1, 1 };
		int x = 1;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (x == arr[i]) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("0");
		}
		System.out.println(count);
	}
}
