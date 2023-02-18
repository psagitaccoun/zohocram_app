package kiran.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kiran.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
