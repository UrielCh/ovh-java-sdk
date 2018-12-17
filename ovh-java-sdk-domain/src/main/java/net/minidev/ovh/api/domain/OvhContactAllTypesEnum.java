package net.minidev.ovh.api.domain;

/**
 * Contact type fields
 */
public enum OvhContactAllTypesEnum {
	admin("admin"),
	all("all"),
	billing("billing"),
	owner("owner"),
	tech("tech");

	final String value;

	OvhContactAllTypesEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
