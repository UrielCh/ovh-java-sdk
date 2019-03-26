package net.minidev.ovh.api.me.payment.method.paymentmethod;

/**
 * Payment method status enum
 */
public enum OvhStatus {
	CANCELED("CANCELED"),
	CANCELING("CANCELING"),
	CREATED("CREATED"),
	ERROR("ERROR"),
	EXPIRED("EXPIRED"),
	CREATING("CREATING"),
	MAINTENANCE("MAINTENANCE"),
	PAUSED("PAUSED"),
	VALID("VALID");

	final String value;

	OvhStatus(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
