package net.minidev.ovh.api.nichandle;

/**
 * Permission given on the account
 */
public enum OvhRoleEnum {
	REGULAR("REGULAR"),
	ADMIN("ADMIN"),
	UNPRIVILEGED("UNPRIVILEGED");

	final String value;

	OvhRoleEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
