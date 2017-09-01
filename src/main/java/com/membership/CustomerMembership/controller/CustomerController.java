package com.membership.CustomerMembership.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.membership.CustomerMembership.entity.CustomerEntity;
import com.membership.CustomerMembership.entity.CustomerEntityPK;
import com.membership.CustomerMembership.service.CustomerService;

/**
 * Customer Controller to handle requests related to search, read, delete,
 * change active state, etc. operations for a customer
 * 
 * @author PARTH
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	/**
	 * A method to get all the customers
	 * 
	 * @return list of customers
	 */
	@GetMapping("/getAllCustomers")
	public List<CustomerEntity> getAllCustomers() {
		List<CustomerEntity> listOfCustomers = customerService.getAllCustomers();
		return listOfCustomers;
	}

	/**
	 * Find customers
	 * 
	 * @param customer
	 *            entity containing fields on which search is to be performed
	 * @return list of matching customers
	 */
	@PostMapping("/findCustomers")
	public List<CustomerEntity> findCustomers(CustomerEntity customer) {
		List<CustomerEntity> list = new ArrayList<CustomerEntity>();
		list.add(customer);
		return customerService.findCustomers(customer);
	}

	/**
	 * Update customer
	 * 
	 * @param new
	 *            customer
	 * @return result of update operation
	 */
	@PutMapping("/updateCustomer")
	public ResponseEntity updateCustomers(@RequestBody CustomerEntity customer) {
		boolean result = customerService.updateCustomer(customer);
		if (result)
			return new ResponseEntity(HttpStatus.OK);
		else
			return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
	}

	/**
	 * Set the active state of customer to given state
	 * 
	 * @param customerEntityPK
	 * @param isActive
	 * @return result of change active state operation
	 */
	@PutMapping("/changeActiveStatus/{isActive}")
	public ResponseEntity changeActiveStatusOfCustomer(@RequestBody CustomerEntityPK customerEntityPK,
			@PathVariable boolean isActive) {
		boolean result = customerService.changeActiveStatusOfCustomer(customerEntityPK, isActive);
		if (result)
			return new ResponseEntity(HttpStatus.OK);
		else
			return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);

	}

	/**
	 * Delete customer if isActive=0
	 * 
	 * @param customerEntityPK
	 * @return result of delete operation
	 */
	@DeleteMapping("/deleteCustomerDetails")
	public ResponseEntity deleteCustomer(@RequestBody CustomerEntityPK customerEntityPK) {
		boolean result = customerService.deleteCustomer(customerEntityPK);
		if (result)
			return new ResponseEntity(HttpStatus.OK);
		else
			return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
	}
}
