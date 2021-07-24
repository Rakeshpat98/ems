package com.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.Entity.BranchEntity;
import com.springboot.Entity.DepartmentEntity;
import com.springboot.Entity.EmployeeEntity;
import com.springboot.Repository.BranchRepository;
import com.springboot.Repository.DepartmentRepository;
import com.springboot.Service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@Autowired
	public DepartmentRepository department;
	
	@Autowired
	public BranchRepository branchrepo;

	@GetMapping("/employee")
	public String employee(Model model) {
		List<EmployeeEntity> listEmployee = employeeService.listAllEmployee();
		model.addAttribute("listEmployee", listEmployee);
		return "employee";
	}

	@GetMapping("/addNewEmployee")
	public String addNewEmployee(Model model) {
		model.addAttribute("employee", new EmployeeEntity());

		List<DepartmentEntity> findAll = department.findAll();
		model.addAttribute("departmentList", findAll);
		System.out.println(findAll);
		
		List<BranchEntity> findAll2 = branchrepo.findAll();
		model.addAttribute("branchList", findAll2);
		System.out.println(findAll2);
		
		
		return "addNewEmployee";
	}

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("employee") EmployeeEntity employeeEntity) {
		employeeService.saveEmployee(employeeEntity);
		return "successEmployee";
	}

	@RequestMapping("/editEmployee/{id}")
	public ModelAndView showEditEmployee(@PathVariable(name = "id") long id) {
		ModelAndView mav = new ModelAndView("addNewEmployee");
		EmployeeEntity employeeEntity = employeeService.getEmployee(id);
		mav.addObject("employee", employeeEntity);
		return mav;

	}

	@RequestMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable(name = "id") long id) {
		employeeService.deleteEmployee(id);
		return "employee";
	}

}
