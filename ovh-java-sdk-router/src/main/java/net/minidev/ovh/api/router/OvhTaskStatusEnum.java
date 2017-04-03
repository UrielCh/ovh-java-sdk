package net.minidev.ovh.api.router;

/**
 * All states a Task can be in
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
