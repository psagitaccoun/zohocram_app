package kiran.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kiran.entities.Billing;
import kiran.repository.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired
	private BillingRepository br;

	@Override
	public void saveBill(Billing b) {
     br.save(b);		
	}

	@Override
	public List<Billing> allBillList() {
		List<Billing> findAll = br.findAll();
		return findAll;
	}

	@Override
	public Billing getOneBill(long id) {
		Optional<Billing> findById = br.findById(id);
		Billing billing = findById.get();
		return billing;
	}

}
