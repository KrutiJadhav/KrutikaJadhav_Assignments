package com.cg.collections;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Employees {
	
	
	private String name;
	private int id;
	private double sal;
	private String departments;
	
	public String getName() {
			return name;
		}
	
	public void setName(String name) {
			this.name = name;
		}
	
	public int getId() {
			return id;
		}
	
	public void setId(int id) {
			this.id = id;
		}
	
	public double getSal() {
			return sal;
		}
	
	public void setSal(double sal) {
			this.sal = sal;
		}
	
	public String getDepartments() {
			return departments;
		}
	
	public void setDepartments(String departments) {
			this.departments = departments;
		}

		public Employees(String name, int id, double sal, String departments) {
			super();
			this.name = name;
			this.id = id;
			this.sal = sal;
			this.departments = departments;
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", id=" + id + ", sal=" + sal + ", departments=" + departments + "]";
		}
}
public class employobjects {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose your sorting category");
		System.out.println("1. Name  2. Id  3. Salary   4. Department");
		int choose = scanner.nextInt();
		// char choose = scanner.next().charAt(0);
		Set<Employees> s = null;
		if (choose == 1) {
			s = new TreeSet<>(new name());
		} else if (choose == 2) {
			s = new TreeSet<>(new Id());
		} else if (choose == 3) {
			s = new TreeSet<>(new salary());
		} else if (choose == 4) {
			s = new TreeSet<>(new department());
		}
		
    	s.add(new Employees("Kesar", 456, 50000, "R&D"));
		s.add(new Employees("Aditya", 123, 60000, "Production"));
		s.add(new Employees("Shreeram", 456, 30000, "R&D"));
		s.add(new Employees("Krishna", 789, 90000, "Quality"));
		s.add(new Employees("Ganesh", 121, 10000, "Production"));
		
		for (Employees temp : s) {
			
			System.out.println(temp);
		}
	}
}

class Id implements Comparator<Employees> {

	@Override
	public int compare(Employees o1, Employees o2) {
		if (o1.getId() > o2.getId()) {
			return 1;
		} else {
			return -1;
		}
	}
}

class name implements Comparator<Employees> {

	@Override
	public int compare(Employees o1, Employees o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class department implements Comparator<Employees> {

	@Override
	public int compare(Employees o1, Employees o2) {
		return o1.getDepartments().compareTo(o2.getDepartments());
	}
}

class salary implements Comparator<Employees> {

	@Override
	public int compare(Employees o1, Employees o2) {
		if (o1.getSal() > o2.getSal()) {
			return 1;
		} else {
			return -1;
		}
	}
}

