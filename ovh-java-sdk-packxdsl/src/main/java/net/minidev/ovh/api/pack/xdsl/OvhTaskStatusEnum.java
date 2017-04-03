package net.minidev.ovh.api.pack.xdsl;

/**
 * Status of a task.
 */
public enum OvhTaskStatusEnum {
	cancelled("cancelled"),
	doing("doing"),
	done("done"),
	error("error"),
	problem("problem"),
	todo("todo");

	final String value;

	OvhTaskStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
