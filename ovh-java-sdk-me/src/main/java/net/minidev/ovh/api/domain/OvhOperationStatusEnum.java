package net.minidev.ovh.api.domain;

/**
 * Operation status
 */
public enum OvhOperationStatusEnum {
	cancelled("cancelled"),
	doing("doing"),
	done("done"),
	error("error"),
	todo("todo");

	final String value;

	OvhOperationStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
