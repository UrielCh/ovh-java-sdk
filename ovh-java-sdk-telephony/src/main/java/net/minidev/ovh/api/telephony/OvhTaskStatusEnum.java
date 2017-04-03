package net.minidev.ovh.api.telephony;

/**
 * Task status
 */
public enum OvhTaskStatusEnum {
	doing("doing"),
	done("done"),
	error("error"),
	pause("pause"),
	todo("todo");

	final String value;

	OvhTaskStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
