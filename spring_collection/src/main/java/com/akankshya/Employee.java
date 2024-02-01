package com.akankshya;

import java.util.List;
import java.util.Set;

public class Employee {
	private int empId;
	private String ename;
	private String eband;
	
	private List<String> skills;
	
	private Set<Address> addresses;
	
	
	

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEband() {
		return eband;
	}
	public void setEband(String eband) {
		this.eband = eband;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public Set<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
	public Employee() {
		System.out.println("No Arg Constructor of Employee class is called");
		
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", eband=" + eband + ", skills=" + skills
				+ ", addresses=" + addresses + "]";
	}
	
	
	
	
	
	
	
}
