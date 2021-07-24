package com.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.Repository.BranchRepository;
import com.springboot.Repository.DepartmentRepository;
import com.springboot.Repository.EmployeeRepository;


@Controller
public class DashboardController 
{
	@Autowired
	public BranchRepository branch;
	
	@Autowired
	public DepartmentRepository department;
	
	@Autowired
	public EmployeeRepository employee;
	
	@RequestMapping("/dashboard")
	public String dashoard(Model model )
	{
		model.addAttribute("branchcount", branch.count());
		model.addAttribute("departmentcount", department.count());
		model.addAttribute("employeecount", employee.count());
		model.addAttribute("developercount", department.getDeveloper());
		model.addAttribute("testercount", department.getTester());
		return "dashboard";
	}
}
//rakesh project
//trying to push
