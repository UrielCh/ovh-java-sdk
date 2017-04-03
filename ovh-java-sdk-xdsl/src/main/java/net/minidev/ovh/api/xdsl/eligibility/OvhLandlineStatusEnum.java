package net.minidev.ovh.api.xdsl.eligibility;

/**
 * Status of a landline
 */
public enum OvhLandlineStatusEnum {
	active("active"),
	inactive("inactive");

	final String value;

	OvhLandlineStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
