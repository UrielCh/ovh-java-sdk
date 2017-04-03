package net.minidev.ovh.api.dedicatedcloud;

/**
 * The billing type of this Dedicated Cloud
 */
public enum OvhBillingTypeEnum {
	demo("demo"),
	monthly("monthly");

	final String value;

	OvhBillingTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
