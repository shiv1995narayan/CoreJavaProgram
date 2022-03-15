package com.inn.java8;

import java.util.ArrayList;
import java.util.function.Predicate;
class Employee{
	String name;
	int salary;
	Employee(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
	
}
public class PredicateEx1{
  public static void main(String[] args) {
	//  Employee e=new Employee("shiv",20000); 
	  //String s="Shivnarayan";
	//  String [] str= {"ram","manmohan","krishna","rahul","Sannya"};
//	Predicate<Integer> p1=i->i%2==0;
//	Predicate<Employee> e2=e1->e1.salary>10000;
//	Predicate<String> st=s1->s1.length()>5;
//	Predicate<String>p=s1->s1.length()>5;
	//  Predicate<String>p=s1->s1.length()%2==0;
//	for(String s:str) {
//		if(p.test(s)) {
//			System.out.println(s);
//		}
//	}
	//System.out.println(st.test(s));
	//System.out.println(e2.test(e));
	//System.out.println(p1.test(15));
	  ArrayList<Employee> ls=new ArrayList<Employee>();
	  ls.add(new Employee("ram",5000));
	  ls.add(new Employee("shayam",10000));
	  ls.add(new Employee("ajay",15000));
	  ls.add(new Employee("karana",25000));
	  ls.add(new Employee("mohan",35000));
	  ls.add(new Employee("kamal",45000));
	  Predicate<Employee>p=e->e.salary>10000;
	  
	  for(Employee e1:ls) {
		  if(p.test(e1))
		  System.out.println(e1.name+":"+e1.salary); 
	  }
	 
}
}
