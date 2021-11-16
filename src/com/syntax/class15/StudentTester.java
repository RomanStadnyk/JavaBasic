package com.syntax.class15;

public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student=new Student();
		student.Name="Roman";
		student.ID="1234";
		Student.numberOfStudents++;
		
		Student student1=new Student();
		student.Name="Bohdana";
		student.ID="1734";
		Student.numberOfStudents++;
		
		Student student2=new Student();
		student.Name="Alex";
		student.ID="188";
		Student.numberOfStudents++;
		
		System.out.println(Student.numberOfStudents);
	}

}
