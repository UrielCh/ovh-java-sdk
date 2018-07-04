package net.minidev.ovh.api.nichandle;

/**
 * Status of a User
 */
public enum OvhUserStatus {
	OK("OK"),
	DISABLED("DISABLED"),
	PASSWORD_CHANGE_REQUIRED("PASSWORD_CHANGE_REQUIRED");

	final String value;

	OvhUserStatus(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
