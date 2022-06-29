package com.cg.organization;

public class heirarchyOrganization {
	
		public static void main(String[] args) {
			
			Employee[] employee=new Employee[4];
			
			employee[0]=new Labour(1,"Jinping",1000);
			employee[1]=new Labour(2,"Donald",2000);
			employee[2]=new Manager(3,"Narendra",50000);
			employee[3]=new Manager(4,"Yogi",50000);
			
			int totalSalary=0;
			
			for (int index = 0; index < employee.length; index++) {
				Employee employee2 = employee[index];
				totalSalary+=employee2.getSalary();
				
				System.out.println(employee2.getSalary());
			}
			
			System.out.println("Total salary is "+totalSalary);
		}

	}
