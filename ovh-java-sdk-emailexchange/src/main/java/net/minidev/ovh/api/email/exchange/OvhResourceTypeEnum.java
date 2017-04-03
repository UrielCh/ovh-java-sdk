package net.minidev.ovh.api.email.exchange;

/**
 * Resource Type
 */
public enum OvhResourceTypeEnum {
	equipment("equipment"),
	room("room");

	final String value;

	OvhResourceTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
