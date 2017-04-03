package net.minidev.ovh.api.domain;

/**
 * Possible values for MX filter
 */
public enum OvhDomainMXFilterEnum {
	CUSTOM("CUSTOM"),
	FULL_FILTERING("FULL_FILTERING"),
	NO_FILTERING("NO_FILTERING"),
	REDIRECT("REDIRECT"),
	SIMPLE_FILTERING("SIMPLE_FILTERING");

	final String value;

	OvhDomainMXFilterEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
