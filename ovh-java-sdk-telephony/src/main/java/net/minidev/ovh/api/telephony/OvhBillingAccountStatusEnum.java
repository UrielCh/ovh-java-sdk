package net.minidev.ovh.api.telephony;

/**
 * Status of billing account
 */
public enum OvhBillingAccountStatusEnum {
	closed("closed"),
	deleted("deleted"),
	enabled("enabled"),
	expired("expired");

	final String value;

	OvhBillingAccountStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
