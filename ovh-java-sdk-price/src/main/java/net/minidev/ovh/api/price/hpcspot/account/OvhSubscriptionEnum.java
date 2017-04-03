package net.minidev.ovh.api.price.hpcspot.account;

/**
 * Enum of Subscriptions
 */
public enum OvhSubscriptionEnum {
	HPCSPOT("HPCSPOT");

	final String value;

	OvhSubscriptionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
