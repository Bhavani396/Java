package com.LinkedList;

import java.util.Scanner;

class Employee {
	int empId;
	String empName;
	Employee next;

	public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
}

public class EmployeeList {
    private Employee head;

    public void addRecord(int empId, String empName) {
        Employee newEmployee = new Employee(empId, empName);
        newEmployee.next = head;
        head = newEmployee;
    }

    public void displayRecords() {
        System.out.println("Employee Records:");

        Employee current = head;
        while (current != null) {
            System.out.println("EmpID: " + current.empId + ", EmpName: " + current.empName);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeList employeeList = new EmployeeList();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            System.out.print("Enter Employee Name: ");
            String empName = sc.nextLine();

            employeeList.addRecord(empId, empName);
        }

        employeeList.displayRecords();
    }
}