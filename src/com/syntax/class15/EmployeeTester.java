package com.syntax.class15;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee empployee=new Employee();
		empployee.empId="123";
		empployee.salary=10000;
		
		Employee empployee2=new Employee();
		empployee2.empId="456";
		empployee2.salary=1006700;
		
		System.out.println(empployee.empId);
		System.out.println(empployee.salary);
		System.out.println(empployee2.empId);
		System.out.println(empployee2.salary);
		System.out.println(Employee.CEO);

	}

}
