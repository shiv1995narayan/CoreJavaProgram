package com.inn.dataStructure;

import java.util.Stack;

public class StackProg1 {
	private static String reverseString(String str) {
		char []ch=new char[str.length()];
		Stack<Character> st=new Stack<>();
		for(int i=0;i<str.length();i++) {
			st.push(str.charAt(i));
		}
		int i=0;
		while(!st.isEmpty()) {
			ch[i++]=st.pop(); 
		}
		return new String(ch);
	}
	private static int[] reverseArray(int[] arr) {
		Stack<Integer> st=new Stack<>();
		int[] arr1=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			st.push(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
		  arr1[i]=st.pop();	
		}
		return arr1;
	}
	private static int countChara(String str1, char ch) {
		int count=0;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)==ch) {
				count++;
			}
		}
		return count;
	}
   public static void main(String[] args) {
//String reverse in useing stack
	   String str="shiv mewada";
	   System.out.println(str+"<====reverse String====>"+reverseString(str));
	   
// Array Reverse using stack	
	   int arr[]= {1,2,3,4,5};
	   for(int i=0;i<arr.length;i++) {
		   System.out.print(arr[i]+" "); 
	   }
	   System.out.println();
	   System.out.println("Array reverse");
	   arr=reverseArray(arr);
	   for(int i=0;i<arr.length;i++) {
		   System.out.print(arr[i]+" "); 
	   }
	   
// count element in string	
	   System.out.println();
	   String str1="shivnarayan mewada";
//	   char ch='n';
	   System.out.println(str1);
	   for(int i=0;i<str1.length();i++){
		   char ch=str1.charAt(i);
		   System.out.println("number of occer time charactor===>"+ch+"===>"+countChara(str1,ch)+" time");   
	   }
	   
}

}
