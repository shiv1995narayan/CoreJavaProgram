package com.inn.arrayProgram;

public class ArrayMaxSumRotasion {
	
	public static void main(String[] args) {
		int arr[] = {3, 2, 1};
		int max = arr[0];
		int add[]=new int[arr.length];
		arrayRotation(arr,add);
		for (int i = 1; i < arr.length; i++)
            if (add[i] > max)
                max = add[i];
		System.out.println("MaxSumOf Array =={}"+max);
	}

	private static int arrayRotation(int[] arr,int[]add) {
		
		for(int j=0; j<arr.length; j++) {
			int sum=0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i] * i;
			}
		int temp=arr[j];
		arr[j]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		add[j]=sum;
		}
		return 0;
	}
}
