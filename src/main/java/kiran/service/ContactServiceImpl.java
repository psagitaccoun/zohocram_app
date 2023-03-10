package kiran.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kiran.entities.Contact;
import kiran.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepository cr;

	@Override
	public void saveOneContact(Contact c) {
		cr.save(c);
	}

	@Override
	public List<Contact> listContacts() {
		List<Contact> findAll = cr.findAll();
		return findAll;
	}

	@Override
	public Contact getOneContact(long id) {
     Optional<Contact> findById = cr.findById(id);
		Contact contact = findById.get();
		return contact;
	}

	@Override
	public void deleteContact(long id) {
		cr.deleteById(id);
	}

}
