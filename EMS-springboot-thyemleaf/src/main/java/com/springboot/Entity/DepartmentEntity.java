package com.springboot.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Department")
public class DepartmentEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String department_Name;
	
	private String department_HeadName;
	
	private long department_HeadPhNo;
	
	@Override
	public String toString() {
		return "DepartmentEntity [id=" + id + ", department_Name=" + department_Name + ", department_HeadName="
				+ department_HeadName + ", department_HeadPhNo=" + department_HeadPhNo + ", department_HeadEmail="
				+ department_HeadEmail + ", department_Branch=" + department_Branch + ", department_Comment="
				+ department_Comment + "]";
	}

	private String department_HeadEmail;
	
	private String department_Branch;
	
	private String department_Comment;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDepartment_Name() {
		return department_Name;
	}

	public void setDepartment_Name(String department_Name) {
		this.department_Name = department_Name;
	}

	public String getDepartment_HeadName() {
		return department_HeadName;
	}

	public void setDepartment_HeadName(String department_HeadName) {
		this.department_HeadName = department_HeadName;
	}

	public long getDepartment_HeadPhNo() {
		return department_HeadPhNo;
	}

	public void setDepartment_HeadPhNo(long department_HeadPhNo) {
		this.department_HeadPhNo = department_HeadPhNo;
	}

	public String getDepartment_HeadEmail() {
		return department_HeadEmail;
	}

	public void setDepartment_HeadEmail(String department_HeadEmail) {
		this.department_HeadEmail = department_HeadEmail;
	}

	public String getDepartment_Branch() {
		return department_Branch;
	}

	public void setDepartment_Branch(String department_Branch) {
		this.department_Branch = department_Branch;
	}

	public String getDepartment_Comment() {
		return department_Comment;
	}

	public void setDepartment_Comment(String department_Comment) {
		this.department_Comment = department_Comment;
	}

	public DepartmentEntity(long id, String department_Name, String department_HeadName, long department_HeadPhNo,
			String department_HeadEmail, String department_Branch, String department_Comment) {
		super();
		this.id = id;
		this.department_Name = department_Name;
		this.department_HeadName = department_HeadName;
		this.department_HeadPhNo = department_HeadPhNo;
		this.department_HeadEmail = department_HeadEmail;
		this.department_Branch = department_Branch;
		this.department_Comment = department_Comment;
	}

	public DepartmentEntity() {
	
	}

	
}

