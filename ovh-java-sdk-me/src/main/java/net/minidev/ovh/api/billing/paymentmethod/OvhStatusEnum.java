package net.minidev.ovh.api.billing.paymentmethod;

/**
 * List of payment method status enum
 */
public enum OvhStatusEnum {
	BLOCKED("BLOCKED"),
	BLOCKED_BY_CUSTOMER("BLOCKED_BY_CUSTOMER"),
	BROKEN("BROKEN"),
	CANCELED("CANCELED"),
	CANCELED_BY_CUSTOMER("CANCELED_BY_CUSTOMER"),
	CREATED("CREATED"),
	ERROR("ERROR"),
	EXPIRED("EXPIRED"),
	PAUSED("PAUSED"),
	VALID("VALID"),
	VALID_FOR_CREDIT("VALID_FOR_CREDIT");

	final String value;

	OvhStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
