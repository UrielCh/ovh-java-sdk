package net.minidev.ovh.api.dedicatedcloud.right;

/**
 * All rights a Dedicated Cloud user may be associated with
 */
public enum OvhRightEnum {
	admin("admin"),
	disabled("disabled"),
	readonly("readonly"),
	readwrite("readwrite");

	final String value;

	OvhRightEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
