package net.minidev.ovh.api.xdsl;

/**
 * Available access roles
 */
public enum OvhAccessRoleEnum {
	backup("backup"),
	main("main");

	final String value;

	OvhAccessRoleEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
