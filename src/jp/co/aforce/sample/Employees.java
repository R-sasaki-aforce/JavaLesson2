package jp.co.aforce.sample;

public class Employees {
	private String name;
	private String department;
	private int salary;
	private int service;

	public Employees(String name, String department, int salary, int service) {
this.name=name;
this.department=department;
this.salary=salary;
this.service=service;


	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getService() {
		return service;
	}

	public void setService(int service) {
		this.service = service;
	}
}
