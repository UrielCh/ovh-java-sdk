package net.minidev.ovh.api.telephony;

/**
 * Billing progress status
 */
public enum OvhBillStatusEnum {
	doing("doing"),
	done("done"),
	error("error"),
	todo("todo");

	final String value;

	OvhBillStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
