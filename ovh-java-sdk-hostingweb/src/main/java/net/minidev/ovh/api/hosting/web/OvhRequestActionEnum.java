package net.minidev.ovh.api.hosting.web;

/**
 * Types of action you can request for your web hosting
 */
public enum OvhRequestActionEnum {
	CHECK_QUOTA("CHECK_QUOTA"),
	FLUSH_CACHE("FLUSH_CACHE"),
	SCAN_ANTIHACK("SCAN_ANTIHACK");

	final String value;

	OvhRequestActionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
