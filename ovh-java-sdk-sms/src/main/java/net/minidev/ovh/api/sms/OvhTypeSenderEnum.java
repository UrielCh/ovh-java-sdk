package net.minidev.ovh.api.sms;

/**
 * All existing types for a given sender
 */
public enum OvhTypeSenderEnum {
	alpha("alpha"),
	numeric("numeric"),
	virtual("virtual");

	final String value;

	OvhTypeSenderEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
