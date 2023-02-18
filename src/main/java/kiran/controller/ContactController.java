package kiran.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kiran.entities.Billing;
import kiran.entities.Contact;
import kiran.service.ContactService;

@Controller
public class ContactController {

	@Autowired
	private ContactService cs;
	
	@RequestMapping("/contact")
	public String listContacts(ModelMap model) {
		List<Contact> listContacts = cs.listContacts();
		model.addAttribute("contacts", listContacts);
		return "contact_list_result";
		}
	
	@RequestMapping("/contactInfo")
	public String contactInfo(@RequestParam("id") long id,ModelMap model) {
		Contact oneContact = cs.getOneContact(id);
		model.addAttribute("stored", oneContact);
		return "contact_info";
		}
	
	
		
}
