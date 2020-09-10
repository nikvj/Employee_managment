package org.melvault.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_managment")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "employee_id")
	private int employeeId;
	
	@Column(name = "employee_name")
	private String empolyeeName;

	@Column(name = "country_salary")
	private int employeesalary;

	@Column(name = "employee_expr")
	private int employeeexpr;
	
	@Column(name = "employee_age")
	private int employeeage;



	public int getEmployeeage() {
		return employeeage;
	}

	public void setEmployeeage(int employeeage) {
		this.employeeage = employeeage;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmpolyeeName() {
		return empolyeeName;
	}

	public void setEmpolyeeName(String empolyeeName) {
		this.empolyeeName = empolyeeName;
	}

	public int getEmployeesalary() {
		return employeesalary;
	}

	public void setEmployeesalary(int employeesalary) {
		this.employeesalary = employeesalary;
	}

	public int getEmployeeexpr() {
		return employeeexpr;
	}

	public void setEmployeeexpr(int employeeexpr) {
		this.employeeexpr = employeeexpr;
	}

}
	