package com.springboot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Entity.DepartmentEntity;
import com.springboot.Repository.DepartmentRepository;

@Service
public class DepartmentService 
{
	@Autowired
	private DepartmentRepository departmentrepository;
	
	public List<DepartmentEntity> listAllDepartment()
	{
		return departmentrepository.findAll();
	}
	
	public void save(DepartmentEntity departmentEntity) {
        departmentrepository.save(departmentEntity);
    }
	
	public DepartmentEntity get(long id) {
        return departmentrepository.findById(id).get();
    }
	
	 public void deletedepartment(long id) {
		 departmentrepository.deleteById(id);
	    }
	 
	
}
