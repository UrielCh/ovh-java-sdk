package net.minidev.ovh.api.connectivity.eligibility;

/**
 * Line status
 */
public enum OvhLineStatusEnum {
	active("active"),
	inactive("inactive");

	final String value;

	OvhLineStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
