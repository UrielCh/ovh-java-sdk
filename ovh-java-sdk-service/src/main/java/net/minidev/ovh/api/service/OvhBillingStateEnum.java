package net.minidev.ovh.api.service;

/**
 * Possible billing states
 */
public enum OvhBillingStateEnum {
	expired("expired"),
	ok("ok"),
	pending("pending"),
	unpaid("unpaid");

	final String value;

	OvhBillingStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
