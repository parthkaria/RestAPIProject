package com.membership.CustomerMembership.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * CustomerEntityPF to represent the composite primary key for Customer
 * 
 * Created by PARTH on 31-08-2017.
 */
public class CustomerEntityPK implements Serializable {
	private short siteId;
	private int customerId;

	@Column(name = "SiteId", nullable = false)
	@Id
	public short getSiteId() {
		return siteId;
	}

	public void setSiteId(short siteId) {
		this.siteId = siteId;
	}

	@Column(name = "CustomerId", nullable = false)
	@Id
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		CustomerEntityPK that = (CustomerEntityPK) o;

		if (siteId != that.siteId)
			return false;
		if (customerId != that.customerId)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) siteId;
		result = 31 * result + customerId;
		return result;
	}
}
