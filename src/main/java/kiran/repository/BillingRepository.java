package kiran.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kiran.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
