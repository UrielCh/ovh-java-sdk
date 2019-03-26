package net.minidev.ovh.api.email.pro;

/**
 * Disclaimer attributes list
 */
public enum OvhDisclaimerAttributeEnum {
	City("City"),
	Company("Company"),
	Country("Country"),
	Department("Department"),
	DisplayName("DisplayName"),
	Email("Email"),
	FaxNumber("FaxNumber"),
	FirstName("FirstName"),
	HomePhoneNumber("HomePhoneNumber"),
	Initials("Initials"),
	LastName("LastName"),
	Manager("Manager"),
	MobileNumber("MobileNumber"),
	Notes("Notes"),
	Office("Office"),
	OtherFaxNumber("OtherFaxNumber"),
	OtherHomePhoneNumber("OtherHomePhoneNumber"),
	OtherPhoneNumber("OtherPhoneNumber"),
	PagerNumber("PagerNumber"),
	PhoneNumber("PhoneNumber"),
	State("State"),
	Street("Street"),
	Title("Title"),
	UserLogonName("UserLogonName"),
	ZipCode("ZipCode");

	final String value;

	OvhDisclaimerAttributeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
