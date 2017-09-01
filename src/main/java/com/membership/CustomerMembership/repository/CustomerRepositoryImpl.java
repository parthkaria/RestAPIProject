package com.membership.CustomerMembership.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Component;

import com.membership.CustomerMembership.entity.CustomerEntity;

/**
 * Customer Repository Implementation
 * 
 * @author PARTH
 */
@Component
public class CustomerRepositoryImpl {
	@Autowired
	CustomerRepository customerRepository;

	public List<CustomerEntity> searchCustomer(CustomerEntity customer) {
		ExampleMatcher matcher = ExampleMatcher.matching().withIgnoreNullValues().withIgnorePaths("customerTypeId",
				"customerId", "siteId");
		Example<CustomerEntity> example = Example.of(customer, matcher);
		List<CustomerEntity> list = customerRepository.findAll(example);
		list.forEach(obj -> {
			System.out.println(obj.getFirstName());
		});
		return list;
	}
}
