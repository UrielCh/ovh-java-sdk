package net.minidev.ovh.api.me.payment.method.transaction;

/**
 * Payment transaction type enum
 */
public enum OvhType {
	CREDIT("CREDIT"),
	DEBIT("DEBIT");

	final String value;

	OvhType(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
