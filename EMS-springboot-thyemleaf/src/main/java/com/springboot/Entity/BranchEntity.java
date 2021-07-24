package com.springboot.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "branch")
public class BranchEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String Branch_Name;
	
	private String Branch_PhNo;
	
	private String Branch_Email;
	
	private String Branch_Location;
	
	private String Branch_Address;
	
	private String Branch_FaxNo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBranch_Name() {
		return Branch_Name;
	}

	public void setBranch_Name(String branch_Name) {
		Branch_Name = branch_Name;
	}

	public String getBranch_PhNo() {
		return Branch_PhNo;
	}

	public void setBranch_PhNo(String branch_PhNo) {
		Branch_PhNo = branch_PhNo;
	}

	public String getBranch_Email() {
		return Branch_Email;
	}

	public void setBranch_Email(String branch_Email) {
		Branch_Email = branch_Email;
	}

	public String getBranch_Location() {
		return Branch_Location;
	}

	public void setBranch_Location(String branch_Location) {
		Branch_Location = branch_Location;
	}

	public String getBranch_Address() {
		return Branch_Address;
	}

	public void setBranch_Address(String branch_Address) {
		Branch_Address = branch_Address;
	}

	public String getBranch_FaxNo() {
		return Branch_FaxNo;
	}

	public void setBranch_FaxNo(String branch_FaxNo) {
		Branch_FaxNo = branch_FaxNo;
	}

	public BranchEntity(Long id, String branch_Name, String branch_PhNo, String branch_Email, String branch_Location,
			String branch_Address, String branch_FaxNo) {
		super();
		this.id = id;
		Branch_Name = branch_Name;
		Branch_PhNo = branch_PhNo;
		Branch_Email = branch_Email;
		Branch_Location = branch_Location;
		Branch_Address = branch_Address;
		Branch_FaxNo = branch_FaxNo;
	}

	public BranchEntity() {
	}
	
	
}
