package com.inn.arrayProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class ArrayRotation {
	public static void main(String[] args) {
//		System.out.println("Print Count Rotation Element of array:");
//		System.out.println(countRotation());
//		System.out.println("----------------------------------------");
//		
//		System.out.println("Print duplicate Element of array and Index");
//		duplicateElement();
//		
//		System.out.println("----------------------------------------");
//		System.out.println("Print Max Element of array");
//		MaxElementFindInArray();
//		System.out.println("----------------------------------------");
//		
//		System.out.println("Arrays Sum");
//		arraysSum();
//		System.out.println("Sum of Digit");
//		sumOfDigit();
//		
//		System.out.println("----------------------------------------");
//		System.out.println("Min value and Max value in List");
//		findMinValveAndMaxValueInList();
//		
//		System.out.println("----------------------------------------");
//		System.out.println("Min value and Max value in Map");
//		findMinValveAndMaxValueInMap();
//		
//		System.out.println("----------------------------------------");
//		System.out.println("Array sort");
//		sortArray();
//		
//		System.out.println();
//		System.out.println("----------------------------------------");
//		System.out.println("Sorting Array Elements By Frequency");
//		sortElementCountForFrequently();
//		
//		
//		System.out.println("----------------------------------------");
//		System.out.println("Right Rotation in Array:");
//		rightRotationinArray();
//		
//		System.out.println("----------------------------------------");
//		System.out.println("Split the array and add the first part to the end:");
//		leftRotationinArray();
//		
//		System.out.println("----------------------------------------");
//		System.out.println("Rearrange an array such that ‘arr[j]’ becomes ‘i’ if ‘arr[i]’ is ‘j’");
//		reArrangeArray();
		
//		System.out.println("----------------------------------------");
//		System.out.println("Rearrange an array in maximum minimum form");
//		reArrangeArrayMaxAndMin();
		
		
//		System.out.println("----------------------------------------");
//		System.out.println("Move all negative numbers to beginning and positive to end with constant extra space");
		//moveToallNagativeNumberinBegining();
		//moveToallNagativeNumberinEnd();
		//rearrangeArrayOddIndexAndEvenIndex();
		//rearrangeArrayOddIndex_Neg_AndEvenIndex_Pog_SwapElement();
		//shuffleRand();
		//System.out.println("Segregate even and odd numbers:");
		//firstEventhenOddNumber();
		
//		System.out.println("K maximum sums of non-overlapping contiguous sub-arrays(Using kadan's algorithem):");
//		System.out.println(contiguoseMaxsumOfArray());
		
		System.out.println("k smallest elements in same order using O(1) extra space");
		smallestElement();
		
    }
	private static void smallestElement() {
		int arr[] = {4, 12, 16, 21, 25};
		int arr1[]=new int[arr.length];
		int count=3;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					
				}else {
					arr1[i]=arr[i];
					break;
				}
			}
		}
		for(int i=0;i<count;i++) {
			System.out.print(arr1[i]+" ");	
		}
		
	}
	private static int contiguoseMaxsumOfArray() {
		int arr[] = {4, 1, 1, -1, -3, -5, 6, 2, -6, -2};
		int local_max=0;
		int globle_max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			local_max=Math.max(arr[i],arr[i]+local_max);
			if(local_max>globle_max) {
			    globle_max=local_max;	
			}
		}
		return globle_max;
	}
	private static void firstEventhenOddNumber() {
		int arr[] = { 1, 3, 2, 4, 7, 6, 9, 10 };
		int arr1[]=new int[arr.length];
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
			  arr1[count++]=arr[i];	
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
			  arr1[count++]=arr[i];	
			}
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");	
		}
		
	}
	private static void shuffleRand() {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		for(int i=arr.length-1;i>0;i--) {
			Random r=new Random();
			int j=r.nextInt(i+1);
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");	
		}
		
		
	}
	private static void rearrangeArrayOddIndex_Neg_AndEvenIndex_Pog_SwapElement() {
		int arr[] = {1, -3, 5, 6, -3, 6, 7, -4, 9, 10} ;
		for(int i=0;i<arr.length-1;i++) {
			if(i%2==0) {
			  if(arr[i]<=0) {
				 int temp=arr[i];
				 arr[i]=arr[i+1];
				 arr[i+1]=temp;
			  }
			}else {
				if(arr[i]>=0 && arr[i+1]<0) {
					int temp=arr[i];
					 arr[i]=arr[i+1];
					 arr[i+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
	}
	private static void rearrangeArrayOddIndexAndEvenIndex() {
		int arr[] = {6, 4, 2, 1, 8, 3} ;
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(i%2==0) {
			  if(arr[i]>=arr[i+1]) {
				 int temp=arr[i];
				 arr[i]=arr[i+1];
				 arr[i+1]=temp;
			  }
			}else {
				if(arr[i]<=arr[i+1]) {
					int temp=arr[i];
					 arr[i]=arr[i+1];
					 arr[i+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
		
	}
	private static void moveToallNagativeNumberinEnd() {
		int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
		int arr1[]=new int [arr.length];
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				arr1[count++]=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				arr1[count++]=arr[i];
			}
		}
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		
	}
	private static void moveToallNagativeNumberinBegining() {
		int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		int arr1[]=arr.clone();
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				arr1[count++]=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				arr1[count++]=arr[i];
			}
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		
		
	}
	private static void reArrangeArrayMaxAndMin() {
		int arr[] = {1, 2, 3, 4, 5, 6, 7} ;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length/2;i++) {
			System.out.print(arr[arr.length-1-i]+" "+arr[i]+" ");
		}
		if(arr.length%2!=0)
		System.out.print(arr[arr.length/2]);
		
	}
	private static int countRotation() {
		// ArrayList<Integer> list=new ArrayList<Integer>();
		// int arr[] = {7, 10, 12, 13, 4};
		// 4
		// int arr[] = {15, 18, 2, 3, 6, 12};
		// 2
		// int arr[] = {7, 9, 11, 12, 5};
		// 4
		int arr[] = { 7, 9, 11, 12, 15 };
		// 0
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				count++;
			} else {
				break;
			}
		}

		if (count == arr.length - 1) {
			return 0;
		} else {
			return count + 1;
		}
	}

	private static void duplicateElement() {
		int arr[] = { 1, 1, 2, 2, 2, 3, 4, 4, 7, 7, 7 };// dup:1,2===index:1,3,4
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				set.add(arr[i + 1]);
				list.add(i + 1);
			}
		}
		System.out.println(set);
		System.out.println(list);
	}

	private static void MaxElementFindInArray() {
		// Input : arr[] = {10, 20, 4} //Output : 20
		// Input : arr[] = {20, 10, 20, 4, 100} /Output : 100

		// int arr[] = {10, 20, 4};
		int arr[] = { 20, 10, 20, 4, 100 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

	private static void arraysSum() {
		int arr[] = { 1, 2, 3 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);

	}

	private static void sumOfDigit() {
		int n = 111;
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n = n / 10;
		}
		System.out.println(sum);
	}
	private static void findMinValveAndMaxValueInList() {
		List<Integer> list=new ArrayList<Integer>();
		list.add(44);
		list.add(11);
		list.add(22);
		list.add(-1);
		Collections.sort(list);
		System.out.println(list);
		System.out.println("Min:"+list.get(0));
		System.out.println("Max:"+list.get(list.size()-1));
		System.out.println("Min():"+Collections.min(list));
		System.out.println("Max():"+Collections.max(list));
		
	}
	private static void findMinValveAndMaxValueInMap() {
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		map.put(1, 10);
		map.put(2, 2);
		map.put(3, 50);
		map.put(4, 1);
		System.out.println(map);
		System.out.println("Min():"+Collections.min(map.values()));
		System.out.println("Max():"+Collections.max(map.values()));
		
		
	}
	private static void sortArray() {
		int arr[] = {2,1,4,3,10,5,9,6,7,8};
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	private static void sortElementCountForFrequently() {
	  int arr[] = {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12};
		Arrays.sort(arr);
		for(int x:arr) {
			System.out.print(x+" ");
		}
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		Iterator value = set.iterator();
		while(value.hasNext()) {
			int count=0;
			int x=0;
			System.out.println("x==={}"+x);
			for(int i=x;i<arr.length-1;i++) {
				if(arr[i]==arr[i+1]) {
				  count++;	
				}
				else {
					break;
				}
			}
			 x=count+1;
			System.out.println("count:"+count);
			System.out.println(value.next()+":"+count);
		}
	}
	private static void rightRotationinArray() {
		
	//	int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	//	int k=3;
		int arr[] = {121, 232, 33, 43 ,5};
		int k=2;
	    int len=arr.length-k;
	    for(int i=len;i<arr.length;i++) {
	    	System.out.print(arr[i]+" ");
	    }
	    for(int i=0;i<len;i++) {
	    	System.out.print(arr[i]+" ");
	    }
	}
	private static void leftRotationinArray() {
	int	arr[] = {12, 10, 5, 6, 52, 36};
      int  k = 2;
      System.out.println("Actual Array:");
      for(int i=0;i<arr.length;i++) {
    	System.out.print(arr[i]+" ");  
      }
      System.out.println();
      System.out.println("k===>"+k);
      for(int i=k;i<arr.length;i++) {
    	  System.out.print(arr[i]+" ");
      }
      for(int i=0;i<k;i++) {
    	  System.out.print(arr[i]+" ");
      }
		
	}
	private static void reArrangeArray() {
	int	arr[]  = {1, 3, 0, 2};
	int ele[] =new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		ele[arr[i]]=i;
	}
	for(int i=0;i<ele.length;i++) {
  	  System.out.print(ele[i]+" ");
    }
	}

	

}
