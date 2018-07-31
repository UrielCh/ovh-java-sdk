package net.minidev.ovh.api.domain;

/**
 * All contact type for a domain
 */
public enum OvhDomainContactTypeEnum {
	admin("admin"),
	billing("billing"),
	owner("owner"),
	tech("tech");

	final String value;

	OvhDomainContactTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
