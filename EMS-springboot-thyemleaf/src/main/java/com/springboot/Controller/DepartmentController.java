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
import com.springboot.Repository.BranchRepository;
import com.springboot.Service.BranchService;
import com.springboot.Service.DepartmentService;

@Controller
public class DepartmentController 
{
	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private BranchService brachservice;
	
	@Autowired
	private BranchRepository branchrepo;
	
	
	@GetMapping("/department")
	public String department(Model model)
	{
		List<DepartmentEntity> departmentList=departmentService.listAllDepartment();
		model.addAttribute("listDepartment", departmentList);
		System.out.println(departmentList);
		
		return "department";
	}
	
	@GetMapping("/addNewDepartment")
	public String addNewDepartment(Model model)
	{
		model.addAttribute("department",new DepartmentEntity());
		List<BranchEntity> all = branchrepo.findAll();
		model.addAttribute("dept_branch", all);
		return "addNewDepartment";
	}
	
	@RequestMapping(value = "/saveDepartment", method = RequestMethod.POST)
	public String saveDepartment(@ModelAttribute("department") DepartmentEntity departmentEntity) {
		departmentService.save(departmentEntity);
		return "successDepartment";
	}
	
	@RequestMapping("/editDepartment/{id}")
	public ModelAndView showEditDepartmentPage(@PathVariable(name = "id") long id) {
		ModelAndView mav = new ModelAndView("addNewDepartment");
		DepartmentEntity departmentEntity = departmentService.get(id);
		mav.addObject("department", departmentEntity);
		return mav;

	}

	@RequestMapping("/deleteDepartment/{id}")
	public String deletedepartment(@PathVariable(name = "id") long id) {
		departmentService.deletedepartment(id);
		return "redirect:/department";
	}
	
}
