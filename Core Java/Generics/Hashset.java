package com.cg.generics;

import java.util.HashSet;

public class Hashset {
	
	public static void main(String[] args) {
		
	        HashSet<Employee> employee= new HashSet();
	        Employee a=new Employee(1,"Kesar",30000,"Quality");
	        Employee b=new Employee(2,"Pratik",20000,"Production");
	        Employee c=new Employee(3,"Arjun",30000,"Manufacture");
	        Employee d=new Employee(4,"Kartik",50000,"R&D");
	        employee.add(a);
	        employee.add(b);
	        employee.add(c);
	        employee.add(d);

	        System.out.println(employee);
	    }
	}
class Employee{
	    int id,salary;
	    String name,dept;
	    public Employee(int id, String name, int salary, String dept){
	        this.id=id;
	        this.name=name;
	        this.salary=salary;
	        this.dept=dept;
	    }
	    @Override
	    public String toString(){
	        return "{ID: "+id+" Name: "+name+" Salary: "+salary+" Department: "+dept+"}";
	    }
	    
	    public void displayDetails(){
	    	
	      System.out.println("{ID: "+id+" Name: "+name+" Salary: "+salary+" Department: "+dept+"}");
	      }
}
