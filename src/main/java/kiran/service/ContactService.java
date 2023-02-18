package kiran.service;

import java.util.List;

import kiran.entities.Contact;

public interface ContactService {

	void saveOneContact(Contact c);

	List<Contact> listContacts();

	Contact getOneContact(long id);

	void deleteContact(long id);

}
