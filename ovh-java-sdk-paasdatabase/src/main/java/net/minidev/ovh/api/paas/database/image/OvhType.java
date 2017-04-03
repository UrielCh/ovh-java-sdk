package net.minidev.ovh.api.paas.database.image;

/**
 * Image type
 */
public enum OvhType {
	mariadb("mariadb"),
	mongodb("mongodb"),
	mysql("mysql"),
	postgresql("postgresql"),
	redis("redis");

	final String value;

	OvhType(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
