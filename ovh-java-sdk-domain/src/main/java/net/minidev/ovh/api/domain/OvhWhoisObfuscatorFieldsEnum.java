package net.minidev.ovh.api.domain;

/**
 * Whois obfuscable fields
 */
public enum OvhWhoisObfuscatorFieldsEnum {
	address("address"),
	email("email"),
	phone("phone");

	final String value;

	OvhWhoisObfuscatorFieldsEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
