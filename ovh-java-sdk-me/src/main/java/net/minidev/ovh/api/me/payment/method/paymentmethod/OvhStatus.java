package net.minidev.ovh.api.me.payment.method.paymentmethod;

/**
 * Payment method status enum
 */
public enum OvhStatus {
	BLOCKED("BLOCKED"),
	BROKEN("BROKEN"),
	CANCELED("CANCELED"),
	CANCELED_BY_CUSTOMER("CANCELED_BY_CUSTOMER"),
	CANCELING("CANCELING"),
	CANCELING_BY_CUSTOMER("CANCELING_BY_CUSTOMER"),
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
