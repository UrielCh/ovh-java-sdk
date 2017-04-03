package net.minidev.ovh.api.overthebox;

/**
 * Status of a task.
 */
public enum OvhActionStatusEnum {
	doing("doing"),
	done("done"),
	error("error"),
	todo("todo");

	final String value;

	OvhActionStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
