package com.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.Entity.DepartmentEntity;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {

	@Query(value = "select count(*) from Department where department_Name='developer'",nativeQuery = true)
	public int getDeveloper();
	
	@Query(value = "select count(*) from Department where department_Name='tester'",nativeQuery = true)
	public int getTester();
	
}
