package net.minidev.ovh.api.hosting.privatedatabase;

/**
 * Private database type
 */
public enum OvhTypeEnum {
	mariadb("mariadb"),
	mysql("mysql"),
	postgresql("postgresql"),
	redis("redis");

	final String value;

	OvhTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
