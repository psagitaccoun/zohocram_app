package kiran.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kiran.entities.Lead;
import kiran.repository.LeadRepository;

@Service
public class leadServiceImpl implements leadService {
	
	@Autowired
	private LeadRepository lr;

	@Override
	public void saveLead(Lead lead) {
		lr.save(lead);
	}

	@Override
	public List<Lead> listLeads() {
		List<Lead> findAll = lr.findAll();
		return findAll;
	}

	@Override
	public Lead getOneLead(long id) {
		Optional<Lead> findById = lr.findById(id);
		Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deleteLead(long id) {
    lr.deleteById(id);		
	}

	

	

	


}
