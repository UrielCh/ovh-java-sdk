package net.minidev.ovh.api.domain;

/**
 * Whois optin fields
 */
public enum OvhOptinFieldsEnum {
	address("address"),
	city("city"),
	country("country"),
	email("email"),
	fax("fax"),
	name("name"),
	organisation("organisation"),
	phone("phone"),
	province("province"),
	zip("zip");

	final String value;

	OvhOptinFieldsEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
