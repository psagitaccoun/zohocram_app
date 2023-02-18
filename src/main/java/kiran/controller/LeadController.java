package kiran.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kiran.entities.Contact;
import kiran.entities.Lead;
import kiran.service.ContactService;
import kiran.service.leadService;
import kiran.util.EmailService;

@Controller
public class LeadController {
	
	@Autowired
	private leadService ls;
	
	@Autowired
	private ContactService cs;
	
	@Autowired
	private EmailService es;

	@RequestMapping("/save")
	public String saveOneLead() {
		return "view_save_page";
		}
	
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute Lead lead,ModelMap model) {
		ls.saveLead(lead);
		es.sendMail(lead.getEmail(), "kiran Company","You seen Ferari");
		model.addAttribute("stored",lead);
		return "lead_info";
		}
	
	@RequestMapping("/list")
	public String listLeads(ModelMap model) {
		List<Lead> lead = ls.listLeads();
		model.addAttribute("lead", lead);
		return "search_lead_result";
		}
	
	
	@RequestMapping("/info")
	public String leadInfo(@RequestParam("id") long id,ModelMap model) {
		Lead oneLead = ls.getOneLead(id);
		model.addAttribute("stored", oneLead);
		return "lead_info";
		}
	
	@RequestMapping("/deleteLead")
	public String deleteLead(@RequestParam("id") long id,ModelMap model) {
		ls.deleteLead(id);
		List<Lead> lead = ls.listLeads();
		model.addAttribute("lead", lead);
		return "search_lead_result";
		}
	
	@RequestMapping("/update")
	public String updateInfo(@RequestParam("id") long id,ModelMap model) {
		Lead oneLead = ls.getOneLead(id);
		model.addAttribute("stored", oneLead);
		return "update_lead";
		}
	
	@RequestMapping("/updateLead")
	public String updateLead(@ModelAttribute Lead lead,ModelMap model) {
		ls.saveLead(lead);
		List<Lead> l = ls.listLeads();
		model.addAttribute("lead", l);
		return "search_lead_result";
		}
	
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id,ModelMap model) {
		Lead oneLead = ls.getOneLead(id);
		Contact c=new Contact();
		c.setFirstName(oneLead.getFirstName());
		c.setLastName(oneLead.getLastName());
		c.setEmail(oneLead.getEmail());
		c.setMobile(oneLead.getMobile());
        cs.saveOneContact(c);
        ls.deleteLead(id);
		List<Lead> lead = ls.listLeads();
		model.addAttribute("lead", lead);
		return "search_lead_result";
		}
	
	
	
	
	
	
	
	
	
	
}
