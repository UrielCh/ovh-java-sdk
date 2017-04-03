package net.minidev.ovh.api.hosting.privatedatabase;

/**
 * Private database type
 */
public enum OvhTypeEnum {
	mysql("mysql"),
	postgresql("postgresql");

	final String value;

	OvhTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
