package net.minidev.ovh.api.telephony;

/**
 * File providing task status
 */
public enum OvhPcsFileStatusEnum {
	doing("doing"),
	done("done"),
	error("error"),
	todo("todo");

	final String value;

	OvhPcsFileStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
