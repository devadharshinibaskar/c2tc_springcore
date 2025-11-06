package com.tnsif.springprojectscollege;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
    public static void main(String[] args) {
        
        ApplicationContext Context = new ClassPathXmlApplicationContext("dept.xml");

       
        College college = Context.getBean("college", College.class);

        // Print the company details, including departments and employees
        college.printCollegeDetails();
        
		/*
		 * // Iterate through each department and find the second highest salary for
		 * (Department department : company.getDepartmentList()) { Double
		 * secondHighestSalary = department.getSecondHighestSalary(); if
		 * (secondHighestSalary != null) {
		 * System.out.println("Second Highest Salary in " +
		 * department.getDepartmentName() + ": " + secondHighestSalary); } else {
		 * System.out.
		 * println("Not enough employees to determine the second highest salary in " +
		 * department.getDepartmentName()); } }
		 */
        
    }
}
