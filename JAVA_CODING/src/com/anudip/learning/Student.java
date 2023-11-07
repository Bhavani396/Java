package com.anudip.learning;

import java.util.Scanner;

public class Student


{
	
	//attributes or data members or class variables
	
	private int idno;
	private String name, course;
	private float avg_marks;
	
	public Student() //default constructor
	{}
	
	public Student(int id, String na, String c, float avg) //constructor with arguments
	{
		idno=id;
		name=na;
		course=c;
		avg_marks=avg;
	}
	
	public Student(int id, String na)
	{
		idno=id;
		name=na;
	}
	
	//function or method
	public void readdata()
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter idno ");
		idno=obj.nextInt();
		System.out.println("Enter Name of the student ");
		name=obj.next();
		System.out.println("Enter Course name ");
		course=obj.next();
		System.out.println("Enter average marks ");
		avg_marks=obj.nextFloat();
		
	}
	
	
	protected void showdata()
	{
		System.out.println("IDNO "+ idno);
		System.out.println("Name "+ name);
		System.out.println("Course "+ course);
		System.out.println("Average "+ avg_marks);
		
		if(avg_marks>=60)
			System.out.println("Grade A+");
		else
			System.out.println("Grade A");
	}
	
	public static void main(String[] args) 
	{
        Student student = new Student(); 
        student.readdata(); 
        student.showdata(); 
	}
	
}
