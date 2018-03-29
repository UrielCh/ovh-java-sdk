package net.minidev.ovh.api.xdsl.email.pro;

/**
 * Status of an Email Pro task.
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
