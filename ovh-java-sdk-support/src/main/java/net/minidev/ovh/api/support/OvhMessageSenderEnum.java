package net.minidev.ovh.api.support;

/**
 * Message sender type
 */
public enum OvhMessageSenderEnum {
	customer("customer"),
	support("support");

	final String value;

	OvhMessageSenderEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
