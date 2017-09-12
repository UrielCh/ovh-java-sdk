package net.minidev.ovh.api.billing;

/**
 * billing task status
 */
public enum OvhBillingTaskStatusEnum {
	cancelled("cancelled"),
	customerError("customerError"),
	doing("doing"),
	done("done"),
	init("init"),
	ovhError("ovhError"),
	todo("todo");

	final String value;

	OvhBillingTaskStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
