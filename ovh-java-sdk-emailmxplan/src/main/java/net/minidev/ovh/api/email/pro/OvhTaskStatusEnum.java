package net.minidev.ovh.api.email.pro;

/**
 * Task status
 */
public enum OvhTaskStatusEnum {
	cancelled("cancelled"),
	doing("doing"),
	done("done"),
	error("error"),
	todo("todo");

	final String value;

	OvhTaskStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
