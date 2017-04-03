package net.minidev.ovh.api.hosting.web.database;

/**
 * Database state
 */
public enum OvhStateEnum {
	close("close"),
	ok("ok"),
	readonly("readonly");

	final String value;

	OvhStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
