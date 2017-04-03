package net.minidev.ovh.api.license.office;

/**
 * Office domain state
 */
public enum OvhDomainStateEnum {
	ok("ok"),
	unverified("unverified");

	final String value;

	OvhDomainStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
