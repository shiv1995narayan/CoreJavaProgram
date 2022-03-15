package com.inn.arrayProgram;

public class ReverseString {
  public static void main(String[] args) {
	String str= "shiv hellow are you";
//	StringBuilder sb=new StringBuilder(str);
//	System.out.println(sb.reverse());
	char ch[]=str.toCharArray();
	String rev="";
	for(int i=ch.length-1;i>=0;i--) {
		rev+=ch[i];
	}
	System.out.println(str);
	System.out.println(rev);
}
}
