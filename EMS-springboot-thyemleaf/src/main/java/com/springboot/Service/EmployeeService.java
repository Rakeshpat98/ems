package com.springboot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Entity.EmployeeEntity;
import com.springboot.Repository.EmployeeRepository;

@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<EmployeeEntity> listAllEmployee()
	{
		return employeeRepository.findAll();
	}
	
	public void saveEmployee(EmployeeEntity empEntity)
	{
		employeeRepository.save(empEntity);
	}
	
	public EmployeeEntity getEmployee(long id)
	{
		return employeeRepository.findById(id).get();
	}
	
	public void deleteEmployee(long id)
	{
		employeeRepository.deleteById(id);
	}
}
