package com.inn.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*public class Test {
 public static void main(String[] args) {
   int a[]= {1,1,2,2,2};
   int n=a.length;
  // assembly(a,n);
   duplicate(a,n);
   // o/p:0,2
}

private static void duplicate(int[] a, int n) {
	for(int i=0 ;i<n;i++) {
		
	}
	
}

//private static void assembly(int[] a, int n) {
//	// TODO Auto-generated method stub
//	for(int i=0;i<n-1;i++) {
//		if(a[i]>a[i+1]) {
//			System.out.print(i+" ");
//		}
//	}
//}
//}
 
}














class Test {
	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 2, 2,3,4,4,7,7 };
		int n = a.length;
		
		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1])
				System.out.print(a[i] + " ");
		}
		System.out.print(a[n - 1]);
		System.out.println();
		for(int j=0;j<n-1;j++) {
			if(a[j]==a[j+1]) {
			  System.out.print(j+1+" ");	
			}
		}
	}
	
}

*/

class Employeesss{
	String name;
	int roll;
	Employeesss(String name, int roll){
		this.name = name;
		this.roll = roll;
	}
	
	public String toString() {
		return "name:"+name+"roll:"+roll;
	}
}
class Test{
	public static void main(String[] args) {
	   List<Employeesss> l1 = new ArrayList<Employeesss>();
	   l1.add(new Employeesss("amar",101));
	   l1.add(new Employeesss("ravi",98));
	   l1.add(new Employeesss("tena",90));
	   l1.add(new Employeesss("gopal",940));
	   l1.add(new Employeesss("pinky",9870));
	   System.out.println(l1);
	   
	   
	 //  Collections.sort(l1,(e1,e2)->e1.roll<e2.roll?-1:e1.roll>e2.roll?1:0);
	   Collections.sort(l1,(e1,e2)->e1.name.compareTo(e2.name));
	   
	   
	   System.out.println(l1);
	}
}

