package net.minidev.ovh.api.overthebox;

/**
 * Status of a task.
 */
public enum OvhTaskStatusEnum {
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
