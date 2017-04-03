package net.minidev.ovh.api.sms;

/**
 * The sms coding
 */
public enum OvhHlrStatuses {
	doing("doing"),
	done("done"),
	error("error"),
	todo("todo");

	final String value;

	OvhHlrStatuses(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
