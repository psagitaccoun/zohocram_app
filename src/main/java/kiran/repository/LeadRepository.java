package kiran.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kiran.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead,Long> {

}
