package net.minidev.ovh.api.hosting.web.database;

/**
 * Database Type enum
 */
public enum OvhDatabaseTypeEnum {
	mariadb("mariadb"),
	mongodb("mongodb"),
	mysql("mysql"),
	postgresql("postgresql"),
	redis("redis");

	final String value;

	OvhDatabaseTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
