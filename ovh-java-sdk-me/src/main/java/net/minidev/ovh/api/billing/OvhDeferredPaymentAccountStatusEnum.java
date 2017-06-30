package net.minidev.ovh.api.billing;

/**
 * Status of your deferred invoice payment account
 */
public enum OvhDeferredPaymentAccountStatusEnum {
	valid("valid");

	final String value;

	OvhDeferredPaymentAccountStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
