package com.springboot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Entity.BranchEntity;
import com.springboot.Repository.BranchRepository;


@Service
public class BranchService {
	@Autowired
	private BranchRepository branchrepo;

	public List<BranchEntity> allbranchlist() {
		return branchrepo.findAll();
	}
	
	public long count()
	{
		return branchrepo.count(); 
	}

	public void save(BranchEntity branch) {
		branchrepo.save(branch);
	}

	public BranchEntity get(long id) {
        return branchrepo.findById(id).get();
    }
     
    public void delete(long id) {
    	branchrepo.deleteById(id);
    }
}
