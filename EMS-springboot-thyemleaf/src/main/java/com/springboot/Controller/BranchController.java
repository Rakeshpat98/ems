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
import com.springboot.Service.BranchService;


@Controller
public class BranchController 
{
	@Autowired
	private BranchService branchService;
	
	@GetMapping("/branch")
	public String branch(Model model) 
	{
		List<BranchEntity> allBranch = branchService.allbranchlist();
		model.addAttribute("addBranch", allBranch);
		return "branch";
	}
	
	@GetMapping("/addNewBranch")
	public String addNewbranch(Model model) 
	{
		model.addAttribute("addBranch", new BranchEntity());
		return "addNewBranch";
	}
	
	// Process the form
		@RequestMapping(value = "/saveNewBranch", method = RequestMethod.POST)
		public String saveStudent(@ModelAttribute("addBranch") BranchEntity branchEntity) {
			branchService.save(branchEntity);
			return "successBranch";
		}
	
		// delete
		@RequestMapping("/delete/{id}")
		public String deletebranch(@PathVariable(name = "id") long id) {
			branchService.delete(id);
			return "redirect:/branch";
		}

		 @RequestMapping("/edit/{id}") public ModelAndView
		  showEditStudentPage(@PathVariable(name = "id") int id) { ModelAndView mav =
		  new ModelAndView("addNewBranch"); BranchEntity branchen = branchService.get(id);
		  mav.addObject("addBranch", branchen); return mav;
		  
		  }
		 
		 @GetMapping("/successBranch")
			public String successBranch() {
				return "successBranch";
			}
}
