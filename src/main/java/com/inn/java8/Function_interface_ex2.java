package com.inn.java8;

import java.util.function.Function;
import java.util.function.Predicate;

class Student{
	String name;
	int marks;
	String gread;
	Student(String name,int marks){
		this.name=name;
		this.marks=marks;
	}
}
public class Function_interface_ex2 {
    public static void main(String[] args) {
		Function<Student,String> f=s1->{
			int marks=s1.marks;
			String gread="";
			if(marks>80) gread="[distence]";
			else if(marks>60) gread="[class A]";
			else if(marks>50) gread="[class B]";
			else if(marks>40) gread="[class C]";
			else if(marks>25) gread="[class D]";
			else gread="[Fail]";
			return gread;
		};
		
		Predicate<Student>p=s1->s1.marks>60;
		
		Student s[]= { 
				new Student("shiv",100),
				new Student("raj",80),
				new Student("karan",60),
				new Student("mena",50),
				new Student("madhu",40),
				new Student("mena",20),
		};
		for(Student s2:s) {
			
			if(p.test(s2)) {
				System.out.println("Name:"+s2.name);
				System.out.println("Marks:"+s2.marks);
				System.out.println("Gread:"+f.apply(s2));
				System.out.println();
			}
			
		}
	}
}
