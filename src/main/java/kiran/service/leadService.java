package kiran.service;


import java.util.List;

import kiran.entities.Lead;

public interface leadService {

	void saveLead(Lead lead);

	List<Lead> listLeads();

	Lead getOneLead(long id);

	void deleteLead(long id);



}
