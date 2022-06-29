package com.cg.organization;

public class Manager extends Employee {
		
		public static final double INCENTIVE=20000;
		private boolean inEligible;
		
		public Manager(int employeeId, String employeeName, double salary) {
			super(employeeId, employeeName, salary);
		}
		public double getSalary() {
			return salary+INCENTIVE;
		}
	}
