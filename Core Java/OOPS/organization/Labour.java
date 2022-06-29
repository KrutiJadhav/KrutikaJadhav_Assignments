package com.cg.organization;

public class Labour extends Employee {

		public static final double OVERTIME=10000;

		public Labour(int employeeId, String employeeName, double salary) {
			super(employeeId, employeeName, salary);       
		}

		public double getSalary() {
			return salary+OVERTIME;
		}

	}
