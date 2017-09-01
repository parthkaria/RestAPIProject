package com.membership.CustomerMembership.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.membership.CustomerMembership.entity.CustomerEntity;
import com.membership.CustomerMembership.entity.CustomerEntityPK;
import com.membership.CustomerMembership.repository.CustomerRepository;
import com.membership.CustomerMembership.repository.CustomerRepositoryImpl;

/**
 * Customer Service
 * 
 * @author PARTH
 */
@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CustomerRepositoryImpl customerRepo;

	public List<CustomerEntity> getAllCustomers() {
		return customerRepository.findAll();
	}

	public List<CustomerEntity> findCustomers(CustomerEntity customer) {
		return customerRepo.searchCustomer(customer);
	}

	/**
	 * Update customer
	 * 
	 * @param customer
	 * @return result of update operation
	 */
	public boolean updateCustomer(CustomerEntity customer) {
		CustomerEntity existingCustomer = customerRepository.findByCustomerIdAndSiteId(customer.getCustomerId(),
				customer.getSiteId());
		if (existingCustomer == null)
			return false;
		customer.setUserName(existingCustomer.getUserName());
		customer.setEmailAddress(existingCustomer.getEmailAddress());
		customerRepository.save(customer);
		return true;
	}

	/**
	 * Change active state of customer
	 * 
	 * @param customerEntityPK
	 * @param isActive
	 * @return result of change state operation
	 */
	public boolean changeActiveStatusOfCustomer(CustomerEntityPK customerEntityPK, boolean isActive) {
		CustomerEntity existingCustomer = customerRepository.findByCustomerIdAndSiteId(customerEntityPK.getCustomerId(),
				customerEntityPK.getSiteId());
		if (existingCustomer == null)
			return false;
		existingCustomer.setActive(isActive);
		customerRepository.save(existingCustomer);
		return true;
	}

	/**
	 * Delete Customer
	 * 
	 * @param customerEntityPK
	 * @return result of delete operation
	 */
	public boolean deleteCustomer(CustomerEntityPK customerEntityPK) {
		CustomerEntity existingCustomer = customerRepository.findByCustomerIdAndSiteId(customerEntityPK.getCustomerId(),
				customerEntityPK.getSiteId());
		if (existingCustomer != null && !existingCustomer.getActive()) {
			existingCustomer.setAddress1(removeData(existingCustomer.getAddress1()));
			existingCustomer.setAddress2(removeData(existingCustomer.getAddress2()));
			existingCustomer.setEmailAddress(removeData(existingCustomer.getEmailAddress()));
			existingCustomer.setPhoneNumberFax(removeData(existingCustomer.getPhoneNumberFax()));
			existingCustomer.setPhoneNumberMobile(removeData(existingCustomer.getPhoneNumberMobile()));
			existingCustomer.setPhoneNumberWork(removeData(existingCustomer.getPhoneNumberWork()));
			existingCustomer.setFirstName(removeData(existingCustomer.getFirstName()));
			existingCustomer.setLastName(removeData(existingCustomer.getLastName()));
			customerRepository.save(existingCustomer);
			return true;
		}
		return false;
	}

	/**
	 * A private method to remove data and convert some characters of name to *
	 * 
	 * @param data
	 * @return updated data
	 */
	private String removeData(String data) {
		if (data == null)
			return data;
		char[] tempArr = data.toCharArray();
		for (int i = 0; i < data.length(); i++) {
			tempArr[i] = i % 2 == 0 ? '*' : tempArr[i];
		}
		return new String(tempArr);
	}
}
