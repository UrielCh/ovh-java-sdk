package net.minidev.ovh.api.hosting.web.localseo.account;

/**
 * Availability of an email address for a local SEO order
 */
public enum OvhEmailAvailabilityEnum {
	available("available"),
	merge("merge"),
	nic("nic"),
	taken("taken");

	final String value;

	OvhEmailAvailabilityEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
