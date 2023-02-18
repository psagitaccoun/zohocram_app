package kiran.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kiran.entities.Billing;
import kiran.entities.Contact;
import kiran.service.BillingService;
import kiran.service.ContactService;

@Controller
public class BillingController {
	
	
	@Autowired
	private ContactService cs;
	
	@Autowired
	private BillingService bs;
	
	@RequestMapping("/generatebill")
	public String generateBill(@RequestParam("id") long id,ModelMap model) {
		Contact oneContact = cs.getOneContact(id);
		model.addAttribute("stored", oneContact);
		cs.deleteContact(id);
		return "generate_bill";
		}
	
	
	@RequestMapping("/saveBill")
	public String saveBill(@ModelAttribute Billing b,ModelMap model) {
		bs.saveBill(b);
		List<Billing> allBillList = bs.allBillList();
		model.addAttribute("stored", allBillList);
		return "billing_list_result";
	}
	
	
	@RequestMapping("/listBill")
	public String listBilling(ModelMap model) {
		List<Billing> allBillList = bs.allBillList();
		model.addAttribute("stored", allBillList);
		return "billing_list_result";
		}
	
	
	@RequestMapping("/billInfo")
	public String billInfo(@RequestParam("id") long id,ModelMap model) {
		Billing oneBill = bs.getOneBill(id);
		model.addAttribute("stored", oneBill);
		return "bill_info";
		
	}
	
}
