package com.membership.CustomerMembership.entity;

import java.sql.Timestamp;
import java.util.Arrays;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * Customer Entity
 * 
 * Created by PARTH on 31-08-2017.
 */
@Entity
@Table(name = "Customer", schema = "dbo", catalog = "v1")
@IdClass(com.membership.CustomerMembership.entity.CustomerEntityPK.class)
public class CustomerEntity {
	private short siteId;

	@Id
	@Column(name = "SiteId", nullable = false)
	public short getSiteId() {
		return siteId;
	}

	public void setSiteId(short siteId) {
		this.siteId = siteId;
	}

	private int customerId;

	@Id
	@Column(name = "CustomerId", nullable = false)
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	private short customerTypeId;

	@Basic
	@Column(name = "CustomerTypeId", nullable = false)
	public short getCustomerTypeId() {
		return customerTypeId;
	}

	public void setCustomerTypeId(short customerTypeId) {
		this.customerTypeId = customerTypeId;
	}

	private String namePrefix;

	@Basic
	@Column(name = "NamePrefix", nullable = true, length = 4)
	public String getNamePrefix() {
		return namePrefix;
	}

	public void setNamePrefix(String namePrefix) {
		this.namePrefix = namePrefix;
	}

	private String firstName;

	@Basic
	@Column(name = "FirstName", nullable = true, length = 30)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	private String middleName;

	@Basic
	@Column(name = "MiddleName", nullable = true, length = 30)
	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	private String lastName;

	@Basic
	@Column(name = "LastName", nullable = true, length = 30)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private String nameSuffix;

	@Basic
	@Column(name = "NameSuffix", nullable = true, length = 4)
	public String getNameSuffix() {
		return nameSuffix;
	}

	public void setNameSuffix(String nameSuffix) {
		this.nameSuffix = nameSuffix;
	}

	private String commonName;

	@Basic
	@Column(name = "CommonName", nullable = true, length = 30)
	public String getCommonName() {
		return commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	private Short customerClassId;

	@Basic
	@Column(name = "CustomerClassId", nullable = true)
	public Short getCustomerClassId() {
		return customerClassId;
	}

	public void setCustomerClassId(Short customerClassId) {
		this.customerClassId = customerClassId;
	}

	private String userName;

	@Basic
	@Column(name = "UserName", nullable = true, length = 255)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	private String emailAddress;

	@Basic
	@Column(name = "EmailAddress", nullable = true, length = 50)
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	private String emailAddressAddtional;

	@Basic
	@Column(name = "EmailAddressAddtional", nullable = true, length = 2147483647)
	public String getEmailAddressAddtional() {
		return emailAddressAddtional;
	}

	public void setEmailAddressAddtional(String emailAddressAddtional) {
		this.emailAddressAddtional = emailAddressAddtional;
	}

	private String password;

	@Basic
	@Column(name = "Password", nullable = true, length = 255)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private Timestamp dateTimePasswordChanged;

	@Basic
	@Column(name = "DateTimePasswordChanged", nullable = true)
	public Timestamp getDateTimePasswordChanged() {
		return dateTimePasswordChanged;
	}

	public void setDateTimePasswordChanged(Timestamp dateTimePasswordChanged) {
		this.dateTimePasswordChanged = dateTimePasswordChanged;
	}

	private String organizationName;

	@Basic
	@Column(name = "OrganizationName", nullable = true, length = 200)
	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	private String title;

	@Basic
	@Column(name = "Title", nullable = true, length = 60)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private String address1;

	@Basic
	@Column(name = "Address1", nullable = true, length = 255)
	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	private String address2;

	@Basic
	@Column(name = "Address2", nullable = true, length = 255)
	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	private String city;

	@Basic
	@Column(name = "City", nullable = true, length = 30)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	private Short stateId;

	@Basic
	@Column(name = "StateId", nullable = true)
	public Short getStateId() {
		return stateId;
	}

	public void setStateId(Short stateId) {
		this.stateId = stateId;
	}

	private String postalCode;

	@Basic
	@Column(name = "PostalCode", nullable = true, length = 30)
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	private Short countryId;

	@Basic
	@Column(name = "CountryId", nullable = true)
	public Short getCountryId() {
		return countryId;
	}

	public void setCountryId(Short countryId) {
		this.countryId = countryId;
	}

	private String phoneNumberHome;

	@Basic
	@Column(name = "PhoneNumberHome", nullable = true, length = 30)
	public String getPhoneNumberHome() {
		return phoneNumberHome;
	}

	public void setPhoneNumberHome(String phoneNumberHome) {
		this.phoneNumberHome = phoneNumberHome;
	}

	private String phoneNumberMobile;

	@Basic
	@Column(name = "PhoneNumberMobile", nullable = true, length = 30)
	public String getPhoneNumberMobile() {
		return phoneNumberMobile;
	}

	public void setPhoneNumberMobile(String phoneNumberMobile) {
		this.phoneNumberMobile = phoneNumberMobile;
	}

	private String phoneNumberWork;

	@Basic
	@Column(name = "PhoneNumberWork", nullable = true, length = 30)
	public String getPhoneNumberWork() {
		return phoneNumberWork;
	}

	public void setPhoneNumberWork(String phoneNumberWork) {
		this.phoneNumberWork = phoneNumberWork;
	}

	private String phoneNumberFax;

	@Basic
	@Column(name = "PhoneNumberFax", nullable = true, length = 30)
	public String getPhoneNumberFax() {
		return phoneNumberFax;
	}

	public void setPhoneNumberFax(String phoneNumberFax) {
		this.phoneNumberFax = phoneNumberFax;
	}

	private Timestamp dateOfBirth;

	@Basic
	@Column(name = "DateOfBirth", nullable = true)
	public Timestamp getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Timestamp dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	private String ssn;

	@Basic
	@Column(name = "SSN", nullable = true, length = 30)
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	private Short languageId;

	@Basic
	@Column(name = "LanguageId", nullable = true)
	public Short getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Short languageId) {
		this.languageId = languageId;
	}

	private Boolean isMale;

	@Basic
	@Column(name = "IsMale", nullable = true)
	public Boolean getMale() {
		return isMale;
	}

	public void setMale(Boolean male) {
		isMale = male;
	}

	private Short birthCountryId;

	@Basic
	@Column(name = "BirthCountryId", nullable = true)
	public Short getBirthCountryId() {
		return birthCountryId;
	}

	public void setBirthCountryId(Short birthCountryId) {
		this.birthCountryId = birthCountryId;
	}

	private String magneticCardNumber;

	@Basic
	@Column(name = "MagneticCardNumber", nullable = true, length = 150)
	public String getMagneticCardNumber() {
		return magneticCardNumber;
	}

	public void setMagneticCardNumber(String magneticCardNumber) {
		this.magneticCardNumber = magneticCardNumber;
	}

	private Timestamp dateOfExpiration;

	@Basic
	@Column(name = "DateOfExpiration", nullable = true)
	public Timestamp getDateOfExpiration() {
		return dateOfExpiration;
	}

	public void setDateOfExpiration(Timestamp dateOfExpiration) {
		this.dateOfExpiration = dateOfExpiration;
	}

	private String code;

	@Basic
	@Column(name = "Code", nullable = true, length = 30)
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	private String note;

	@Basic
	@Column(name = "Note", nullable = true, length = 2147483647)
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	private String creditLimit;

	@Basic
	@Column(name = "CreditLimit", nullable = true)
	public String getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}

	private Double discountPercent;

	@Basic
	@Column(name = "DiscountPercent", nullable = true, precision = 0)
	public Double getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(Double discountPercent) {
		this.discountPercent = discountPercent;
	}

	private String federalTaxCode;

	@Basic
	@Column(name = "FederalTaxCode", nullable = true, length = 30)
	public String getFederalTaxCode() {
		return federalTaxCode;
	}

	public void setFederalTaxCode(String federalTaxCode) {
		this.federalTaxCode = federalTaxCode;
	}

	private String stateTaxCode;

	@Basic
	@Column(name = "StateTaxCode", nullable = true, length = 30)
	public String getStateTaxCode() {
		return stateTaxCode;
	}

	public void setStateTaxCode(String stateTaxCode) {
		this.stateTaxCode = stateTaxCode;
	}

	private byte[] picture;

	@Basic
	@Column(name = "Picture", nullable = true)
	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	private String shippingAddress1;

	@Basic
	@Column(name = "ShippingAddress1", nullable = true, length = 50)
	public String getShippingAddress1() {
		return shippingAddress1;
	}

	public void setShippingAddress1(String shippingAddress1) {
		this.shippingAddress1 = shippingAddress1;
	}

	private String shippingAddress2;

	@Basic
	@Column(name = "ShippingAddress2", nullable = true, length = 50)
	public String getShippingAddress2() {
		return shippingAddress2;
	}

	public void setShippingAddress2(String shippingAddress2) {
		this.shippingAddress2 = shippingAddress2;
	}

	private String shippingCity;

	@Basic
	@Column(name = "ShippingCity", nullable = true, length = 30)
	public String getShippingCity() {
		return shippingCity;
	}

	public void setShippingCity(String shippingCity) {
		this.shippingCity = shippingCity;
	}

	private String shippingPostalCode;

	@Basic
	@Column(name = "ShippingPostalCode", nullable = true, length = 12)
	public String getShippingPostalCode() {
		return shippingPostalCode;
	}

	public void setShippingPostalCode(String shippingPostalCode) {
		this.shippingPostalCode = shippingPostalCode;
	}

	private Short shippingStateId;

	@Basic
	@Column(name = "ShippingStateId", nullable = true)
	public Short getShippingStateId() {
		return shippingStateId;
	}

	public void setShippingStateId(Short shippingStateId) {
		this.shippingStateId = shippingStateId;
	}

	private Short shippingCountryId;

	@Basic
	@Column(name = "ShippingCountryId", nullable = true)
	public Short getShippingCountryId() {
		return shippingCountryId;
	}

	public void setShippingCountryId(Short shippingCountryId) {
		this.shippingCountryId = shippingCountryId;
	}

	private String url;

	@Basic
	@Column(name = "URL", nullable = true, length = 255)
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	private Boolean isActive;

	@Basic
	@Column(name = "IsActive", nullable = true)
	public Boolean getActive() {
		return isActive;
	}

	public void setActive(Boolean active) {
		isActive = active;
	}

	private Boolean isAllowMail;

	@Basic
	@Column(name = "IsAllowMail", nullable = true)
	public Boolean getAllowMail() {
		return isAllowMail;
	}

	public void setAllowMail(Boolean allowMail) {
		isAllowMail = allowMail;
	}

	private Boolean isNewsLetter;

	@Basic
	@Column(name = "IsNewsLetter", nullable = true)
	public Boolean getNewsLetter() {
		return isNewsLetter;
	}

	public void setNewsLetter(Boolean newsLetter) {
		isNewsLetter = newsLetter;
	}

	private Boolean isAllowPost;

	@Basic
	@Column(name = "IsAllowPost", nullable = true)
	public Boolean getAllowPost() {
		return isAllowPost;
	}

	public void setAllowPost(Boolean allowPost) {
		isAllowPost = allowPost;
	}

	private Boolean isAllowSms;

	@Basic
	@Column(name = "IsAllowSMS", nullable = true)
	public Boolean getAllowSms() {
		return isAllowSms;
	}

	public void setAllowSms(Boolean allowSms) {
		isAllowSms = allowSms;
	}

	private Boolean isAllow3RdParty;

	@Basic
	@Column(name = "IsAllow3rdParty", nullable = true)
	public Boolean getAllow3RdParty() {
		return isAllow3RdParty;
	}

	public void setAllow3RdParty(Boolean allow3RdParty) {
		isAllow3RdParty = allow3RdParty;
	}

	private Boolean isTransactionNotification;

	@Basic
	@Column(name = "IsTransactionNotification", nullable = true)
	public Boolean getTransactionNotification() {
		return isTransactionNotification;
	}

	public void setTransactionNotification(Boolean transactionNotification) {
		isTransactionNotification = transactionNotification;
	}

	private String generalLedgerAccount;

	@Basic
	@Column(name = "GeneralLedgerAccount", nullable = true, length = 50)
	public String getGeneralLedgerAccount() {
		return generalLedgerAccount;
	}

	public void setGeneralLedgerAccount(String generalLedgerAccount) {
		this.generalLedgerAccount = generalLedgerAccount;
	}

	private String serverFileName;

	@Basic
	@Column(name = "ServerFileName", nullable = true, length = 255)
	public String getServerFileName() {
		return serverFileName;
	}

	public void setServerFileName(String serverFileName) {
		this.serverFileName = serverFileName;
	}

	private String storedValueGeneralLedgerAccount;

	@Basic
	@Column(name = "StoredValueGeneralLedgerAccount", nullable = true, length = 50)
	public String getStoredValueGeneralLedgerAccount() {
		return storedValueGeneralLedgerAccount;
	}

	public void setStoredValueGeneralLedgerAccount(String storedValueGeneralLedgerAccount) {
		this.storedValueGeneralLedgerAccount = storedValueGeneralLedgerAccount;
	}

	private Short customerGeneralLedgerPolicyId;

	@Basic
	@Column(name = "CustomerGeneralLedgerPolicyId", nullable = true)
	public Short getCustomerGeneralLedgerPolicyId() {
		return customerGeneralLedgerPolicyId;
	}

	public void setCustomerGeneralLedgerPolicyId(Short customerGeneralLedgerPolicyId) {
		this.customerGeneralLedgerPolicyId = customerGeneralLedgerPolicyId;
	}

	private Short customerPaymentTypeId;

	@Basic
	@Column(name = "CustomerPaymentTypeId", nullable = true)
	public Short getCustomerPaymentTypeId() {
		return customerPaymentTypeId;
	}

	public void setCustomerPaymentTypeId(Short customerPaymentTypeId) {
		this.customerPaymentTypeId = customerPaymentTypeId;
	}

	private Short mainCustomerGroupId;

	@Basic
	@Column(name = "MainCustomerGroupId", nullable = true)
	public Short getMainCustomerGroupId() {
		return mainCustomerGroupId;
	}

	public void setMainCustomerGroupId(Short mainCustomerGroupId) {
		this.mainCustomerGroupId = mainCustomerGroupId;
	}

	private String interfaceCodeA;

	@Basic
	@Column(name = "InterfaceCodeA", nullable = true, length = 30)
	public String getInterfaceCodeA() {
		return interfaceCodeA;
	}

	public void setInterfaceCodeA(String interfaceCodeA) {
		this.interfaceCodeA = interfaceCodeA;
	}

	private String interfaceCodeB;

	@Basic
	@Column(name = "InterfaceCodeB", nullable = true, length = 30)
	public String getInterfaceCodeB() {
		return interfaceCodeB;
	}

	public void setInterfaceCodeB(String interfaceCodeB) {
		this.interfaceCodeB = interfaceCodeB;
	}

	private String interfaceCodeC;

	@Basic
	@Column(name = "InterfaceCodeC", nullable = true, length = 30)
	public String getInterfaceCodeC() {
		return interfaceCodeC;
	}

	public void setInterfaceCodeC(String interfaceCodeC) {
		this.interfaceCodeC = interfaceCodeC;
	}

	private String interfaceCodeD;

	@Basic
	@Column(name = "InterfaceCodeD", nullable = true, length = 30)
	public String getInterfaceCodeD() {
		return interfaceCodeD;
	}

	public void setInterfaceCodeD(String interfaceCodeD) {
		this.interfaceCodeD = interfaceCodeD;
	}

	private String personalCode;

	@Basic
	@Column(name = "PersonalCode", nullable = true, length = 30)
	public String getPersonalCode() {
		return personalCode;
	}

	public void setPersonalCode(String personalCode) {
		this.personalCode = personalCode;
	}

	private String personalCodeUsed;

	@Basic
	@Column(name = "PersonalCodeUsed", nullable = true, length = 30)
	public String getPersonalCodeUsed() {
		return personalCodeUsed;
	}

	public void setPersonalCodeUsed(String personalCodeUsed) {
		this.personalCodeUsed = personalCodeUsed;
	}

	private Timestamp updateDateTime;

	@Basic
	@Column(name = "UpdateDateTime", nullable = false)
	public Timestamp getUpdateDateTime() {
		return updateDateTime;
	}

	public void setUpdateDateTime(Timestamp updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

	private Timestamp remoteUpdateDateTime;

	@Basic
	@Column(name = "RemoteUpdateDateTime", nullable = true)
	public Timestamp getRemoteUpdateDateTime() {
		return remoteUpdateDateTime;
	}

	public void setRemoteUpdateDateTime(Timestamp remoteUpdateDateTime) {
		this.remoteUpdateDateTime = remoteUpdateDateTime;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		CustomerEntity that = (CustomerEntity) o;

		if (siteId != that.siteId)
			return false;
		if (customerId != that.customerId)
			return false;
		if (customerTypeId != that.customerTypeId)
			return false;
		if (namePrefix != null ? !namePrefix.equals(that.namePrefix) : that.namePrefix != null)
			return false;
		if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null)
			return false;
		if (middleName != null ? !middleName.equals(that.middleName) : that.middleName != null)
			return false;
		if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null)
			return false;
		if (nameSuffix != null ? !nameSuffix.equals(that.nameSuffix) : that.nameSuffix != null)
			return false;
		if (commonName != null ? !commonName.equals(that.commonName) : that.commonName != null)
			return false;
		if (customerClassId != null ? !customerClassId.equals(that.customerClassId) : that.customerClassId != null)
			return false;
		if (userName != null ? !userName.equals(that.userName) : that.userName != null)
			return false;
		if (emailAddress != null ? !emailAddress.equals(that.emailAddress) : that.emailAddress != null)
			return false;
		if (emailAddressAddtional != null ? !emailAddressAddtional.equals(that.emailAddressAddtional)
				: that.emailAddressAddtional != null)
			return false;
		if (password != null ? !password.equals(that.password) : that.password != null)
			return false;
		if (dateTimePasswordChanged != null ? !dateTimePasswordChanged.equals(that.dateTimePasswordChanged)
				: that.dateTimePasswordChanged != null)
			return false;
		if (organizationName != null ? !organizationName.equals(that.organizationName) : that.organizationName != null)
			return false;
		if (title != null ? !title.equals(that.title) : that.title != null)
			return false;
		if (address1 != null ? !address1.equals(that.address1) : that.address1 != null)
			return false;
		if (address2 != null ? !address2.equals(that.address2) : that.address2 != null)
			return false;
		if (city != null ? !city.equals(that.city) : that.city != null)
			return false;
		if (stateId != null ? !stateId.equals(that.stateId) : that.stateId != null)
			return false;
		if (postalCode != null ? !postalCode.equals(that.postalCode) : that.postalCode != null)
			return false;
		if (countryId != null ? !countryId.equals(that.countryId) : that.countryId != null)
			return false;
		if (phoneNumberHome != null ? !phoneNumberHome.equals(that.phoneNumberHome) : that.phoneNumberHome != null)
			return false;
		if (phoneNumberMobile != null ? !phoneNumberMobile.equals(that.phoneNumberMobile)
				: that.phoneNumberMobile != null)
			return false;
		if (phoneNumberWork != null ? !phoneNumberWork.equals(that.phoneNumberWork) : that.phoneNumberWork != null)
			return false;
		if (phoneNumberFax != null ? !phoneNumberFax.equals(that.phoneNumberFax) : that.phoneNumberFax != null)
			return false;
		if (dateOfBirth != null ? !dateOfBirth.equals(that.dateOfBirth) : that.dateOfBirth != null)
			return false;
		if (ssn != null ? !ssn.equals(that.ssn) : that.ssn != null)
			return false;
		if (languageId != null ? !languageId.equals(that.languageId) : that.languageId != null)
			return false;
		if (isMale != null ? !isMale.equals(that.isMale) : that.isMale != null)
			return false;
		if (birthCountryId != null ? !birthCountryId.equals(that.birthCountryId) : that.birthCountryId != null)
			return false;
		if (magneticCardNumber != null ? !magneticCardNumber.equals(that.magneticCardNumber)
				: that.magneticCardNumber != null)
			return false;
		if (dateOfExpiration != null ? !dateOfExpiration.equals(that.dateOfExpiration) : that.dateOfExpiration != null)
			return false;
		if (code != null ? !code.equals(that.code) : that.code != null)
			return false;
		if (note != null ? !note.equals(that.note) : that.note != null)
			return false;
		if (creditLimit != null ? !creditLimit.equals(that.creditLimit) : that.creditLimit != null)
			return false;
		if (discountPercent != null ? !discountPercent.equals(that.discountPercent) : that.discountPercent != null)
			return false;
		if (federalTaxCode != null ? !federalTaxCode.equals(that.federalTaxCode) : that.federalTaxCode != null)
			return false;
		if (stateTaxCode != null ? !stateTaxCode.equals(that.stateTaxCode) : that.stateTaxCode != null)
			return false;
		if (!Arrays.equals(picture, that.picture))
			return false;
		if (shippingAddress1 != null ? !shippingAddress1.equals(that.shippingAddress1) : that.shippingAddress1 != null)
			return false;
		if (shippingAddress2 != null ? !shippingAddress2.equals(that.shippingAddress2) : that.shippingAddress2 != null)
			return false;
		if (shippingCity != null ? !shippingCity.equals(that.shippingCity) : that.shippingCity != null)
			return false;
		if (shippingPostalCode != null ? !shippingPostalCode.equals(that.shippingPostalCode)
				: that.shippingPostalCode != null)
			return false;
		if (shippingStateId != null ? !shippingStateId.equals(that.shippingStateId) : that.shippingStateId != null)
			return false;
		if (shippingCountryId != null ? !shippingCountryId.equals(that.shippingCountryId)
				: that.shippingCountryId != null)
			return false;
		if (url != null ? !url.equals(that.url) : that.url != null)
			return false;
		if (isActive != null ? !isActive.equals(that.isActive) : that.isActive != null)
			return false;
		if (isAllowMail != null ? !isAllowMail.equals(that.isAllowMail) : that.isAllowMail != null)
			return false;
		if (isNewsLetter != null ? !isNewsLetter.equals(that.isNewsLetter) : that.isNewsLetter != null)
			return false;
		if (isAllowPost != null ? !isAllowPost.equals(that.isAllowPost) : that.isAllowPost != null)
			return false;
		if (isAllowSms != null ? !isAllowSms.equals(that.isAllowSms) : that.isAllowSms != null)
			return false;
		if (isAllow3RdParty != null ? !isAllow3RdParty.equals(that.isAllow3RdParty) : that.isAllow3RdParty != null)
			return false;
		if (isTransactionNotification != null ? !isTransactionNotification.equals(that.isTransactionNotification)
				: that.isTransactionNotification != null)
			return false;
		if (generalLedgerAccount != null ? !generalLedgerAccount.equals(that.generalLedgerAccount)
				: that.generalLedgerAccount != null)
			return false;
		if (serverFileName != null ? !serverFileName.equals(that.serverFileName) : that.serverFileName != null)
			return false;
		if (storedValueGeneralLedgerAccount != null
				? !storedValueGeneralLedgerAccount.equals(that.storedValueGeneralLedgerAccount)
				: that.storedValueGeneralLedgerAccount != null)
			return false;
		if (customerGeneralLedgerPolicyId != null
				? !customerGeneralLedgerPolicyId.equals(that.customerGeneralLedgerPolicyId)
				: that.customerGeneralLedgerPolicyId != null)
			return false;
		if (customerPaymentTypeId != null ? !customerPaymentTypeId.equals(that.customerPaymentTypeId)
				: that.customerPaymentTypeId != null)
			return false;
		if (mainCustomerGroupId != null ? !mainCustomerGroupId.equals(that.mainCustomerGroupId)
				: that.mainCustomerGroupId != null)
			return false;
		if (interfaceCodeA != null ? !interfaceCodeA.equals(that.interfaceCodeA) : that.interfaceCodeA != null)
			return false;
		if (interfaceCodeB != null ? !interfaceCodeB.equals(that.interfaceCodeB) : that.interfaceCodeB != null)
			return false;
		if (interfaceCodeC != null ? !interfaceCodeC.equals(that.interfaceCodeC) : that.interfaceCodeC != null)
			return false;
		if (interfaceCodeD != null ? !interfaceCodeD.equals(that.interfaceCodeD) : that.interfaceCodeD != null)
			return false;
		if (personalCode != null ? !personalCode.equals(that.personalCode) : that.personalCode != null)
			return false;
		if (personalCodeUsed != null ? !personalCodeUsed.equals(that.personalCodeUsed) : that.personalCodeUsed != null)
			return false;
		if (updateDateTime != null ? !updateDateTime.equals(that.updateDateTime) : that.updateDateTime != null)
			return false;
		if (remoteUpdateDateTime != null ? !remoteUpdateDateTime.equals(that.remoteUpdateDateTime)
				: that.remoteUpdateDateTime != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) siteId;
		result = 31 * result + customerId;
		result = 31 * result + (int) customerTypeId;
		result = 31 * result + (namePrefix != null ? namePrefix.hashCode() : 0);
		result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
		result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
		result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
		result = 31 * result + (nameSuffix != null ? nameSuffix.hashCode() : 0);
		result = 31 * result + (commonName != null ? commonName.hashCode() : 0);
		result = 31 * result + (customerClassId != null ? customerClassId.hashCode() : 0);
		result = 31 * result + (userName != null ? userName.hashCode() : 0);
		result = 31 * result + (emailAddress != null ? emailAddress.hashCode() : 0);
		result = 31 * result + (emailAddressAddtional != null ? emailAddressAddtional.hashCode() : 0);
		result = 31 * result + (password != null ? password.hashCode() : 0);
		result = 31 * result + (dateTimePasswordChanged != null ? dateTimePasswordChanged.hashCode() : 0);
		result = 31 * result + (organizationName != null ? organizationName.hashCode() : 0);
		result = 31 * result + (title != null ? title.hashCode() : 0);
		result = 31 * result + (address1 != null ? address1.hashCode() : 0);
		result = 31 * result + (address2 != null ? address2.hashCode() : 0);
		result = 31 * result + (city != null ? city.hashCode() : 0);
		result = 31 * result + (stateId != null ? stateId.hashCode() : 0);
		result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
		result = 31 * result + (countryId != null ? countryId.hashCode() : 0);
		result = 31 * result + (phoneNumberHome != null ? phoneNumberHome.hashCode() : 0);
		result = 31 * result + (phoneNumberMobile != null ? phoneNumberMobile.hashCode() : 0);
		result = 31 * result + (phoneNumberWork != null ? phoneNumberWork.hashCode() : 0);
		result = 31 * result + (phoneNumberFax != null ? phoneNumberFax.hashCode() : 0);
		result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
		result = 31 * result + (ssn != null ? ssn.hashCode() : 0);
		result = 31 * result + (languageId != null ? languageId.hashCode() : 0);
		result = 31 * result + (isMale != null ? isMale.hashCode() : 0);
		result = 31 * result + (birthCountryId != null ? birthCountryId.hashCode() : 0);
		result = 31 * result + (magneticCardNumber != null ? magneticCardNumber.hashCode() : 0);
		result = 31 * result + (dateOfExpiration != null ? dateOfExpiration.hashCode() : 0);
		result = 31 * result + (code != null ? code.hashCode() : 0);
		result = 31 * result + (note != null ? note.hashCode() : 0);
		result = 31 * result + (creditLimit != null ? creditLimit.hashCode() : 0);
		result = 31 * result + (discountPercent != null ? discountPercent.hashCode() : 0);
		result = 31 * result + (federalTaxCode != null ? federalTaxCode.hashCode() : 0);
		result = 31 * result + (stateTaxCode != null ? stateTaxCode.hashCode() : 0);
		result = 31 * result + Arrays.hashCode(picture);
		result = 31 * result + (shippingAddress1 != null ? shippingAddress1.hashCode() : 0);
		result = 31 * result + (shippingAddress2 != null ? shippingAddress2.hashCode() : 0);
		result = 31 * result + (shippingCity != null ? shippingCity.hashCode() : 0);
		result = 31 * result + (shippingPostalCode != null ? shippingPostalCode.hashCode() : 0);
		result = 31 * result + (shippingStateId != null ? shippingStateId.hashCode() : 0);
		result = 31 * result + (shippingCountryId != null ? shippingCountryId.hashCode() : 0);
		result = 31 * result + (url != null ? url.hashCode() : 0);
		result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
		result = 31 * result + (isAllowMail != null ? isAllowMail.hashCode() : 0);
		result = 31 * result + (isNewsLetter != null ? isNewsLetter.hashCode() : 0);
		result = 31 * result + (isAllowPost != null ? isAllowPost.hashCode() : 0);
		result = 31 * result + (isAllowSms != null ? isAllowSms.hashCode() : 0);
		result = 31 * result + (isAllow3RdParty != null ? isAllow3RdParty.hashCode() : 0);
		result = 31 * result + (isTransactionNotification != null ? isTransactionNotification.hashCode() : 0);
		result = 31 * result + (generalLedgerAccount != null ? generalLedgerAccount.hashCode() : 0);
		result = 31 * result + (serverFileName != null ? serverFileName.hashCode() : 0);
		result = 31 * result
				+ (storedValueGeneralLedgerAccount != null ? storedValueGeneralLedgerAccount.hashCode() : 0);
		result = 31 * result + (customerGeneralLedgerPolicyId != null ? customerGeneralLedgerPolicyId.hashCode() : 0);
		result = 31 * result + (customerPaymentTypeId != null ? customerPaymentTypeId.hashCode() : 0);
		result = 31 * result + (mainCustomerGroupId != null ? mainCustomerGroupId.hashCode() : 0);
		result = 31 * result + (interfaceCodeA != null ? interfaceCodeA.hashCode() : 0);
		result = 31 * result + (interfaceCodeB != null ? interfaceCodeB.hashCode() : 0);
		result = 31 * result + (interfaceCodeC != null ? interfaceCodeC.hashCode() : 0);
		result = 31 * result + (interfaceCodeD != null ? interfaceCodeD.hashCode() : 0);
		result = 31 * result + (personalCode != null ? personalCode.hashCode() : 0);
		result = 31 * result + (personalCodeUsed != null ? personalCodeUsed.hashCode() : 0);
		result = 31 * result + (updateDateTime != null ? updateDateTime.hashCode() : 0);
		result = 31 * result + (remoteUpdateDateTime != null ? remoteUpdateDateTime.hashCode() : 0);
		return result;
	}
}
