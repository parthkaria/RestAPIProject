package com.membership.CustomerMembership.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.membership.CustomerMembership.entity.CustomerEntity;

/**
 * Customer Repository
 * 
 * @author PARTH
 */
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long>{
	CustomerEntity findByCustomerIdAndSiteId(int customerId, short siteId);
}
