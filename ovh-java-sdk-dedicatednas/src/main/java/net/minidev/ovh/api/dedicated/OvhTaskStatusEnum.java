package net.minidev.ovh.api.dedicated;

/**
 * different task status
 */
public enum OvhTaskStatusEnum {
	cancelled("cancelled"),
	customerError("customerError"),
	doing("doing"),
	done("done"),
	init("init"),
	ovhError("ovhError"),
	todo("todo");

	final String value;

	OvhTaskStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
