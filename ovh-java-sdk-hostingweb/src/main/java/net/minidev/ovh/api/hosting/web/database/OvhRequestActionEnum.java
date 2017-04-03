package net.minidev.ovh.api.hosting.web.database;

/**
 * Types of action you can request for your database
 */
public enum OvhRequestActionEnum {
	CHECK_QUOTA("CHECK_QUOTA");

	final String value;

	OvhRequestActionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
