package com.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Entity.BranchEntity;

public interface BranchRepository extends JpaRepository<BranchEntity, Long> {

}
