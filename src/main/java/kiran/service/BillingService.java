package kiran.service;

import java.util.List;

import kiran.entities.Billing;

public interface BillingService {

	void saveBill(Billing b);

	List<Billing> allBillList();

  Billing getOneBill(long id);

}
