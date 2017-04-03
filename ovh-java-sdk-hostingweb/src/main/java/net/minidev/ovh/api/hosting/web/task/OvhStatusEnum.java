package net.minidev.ovh.api.hosting.web.task;

/**
 * Task's status
 */
public enum OvhStatusEnum {
	cancelled("cancelled"),
	doing("doing"),
	done("done"),
	error("error"),
	init("init"),
	todo("todo");

	final String value;

	OvhStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
