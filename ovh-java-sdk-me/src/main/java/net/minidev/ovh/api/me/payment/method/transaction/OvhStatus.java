package net.minidev.ovh.api.me.payment.method.transaction;

/**
 * Payment transaction status enum
 */
public enum OvhStatus {
	CANCELED("CANCELED"),
	CANCELING("CANCELING"),
	CONFIRMING("CONFIRMING"),
	CREATED("CREATED"),
	ERROR("ERROR"),
	FAILED("FAILED"),
	READY("READY"),
	SUCCESS("SUCCESS");

	final String value;

	OvhStatus(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
