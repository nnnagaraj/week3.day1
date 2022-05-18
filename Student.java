package week3.day1.assignments;

import week3.day1.assignment2.Department;

public class Student extends Department {
	
	public static void studentName(){
		System.out.println("Student Name:Nagaraj");
	}
	
	public static void studentDept(){
		System.out.println("Student Dept:Mechanical");
	}
	
	public static void studentId(){
		System.out.println("Student ID:501");
	}

	public static void main(String[] args) {
		
		Student stud = new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.studentName();
		stud.studentId();
		stud.studentDept();
		stud.deptName();

		
	}
}
