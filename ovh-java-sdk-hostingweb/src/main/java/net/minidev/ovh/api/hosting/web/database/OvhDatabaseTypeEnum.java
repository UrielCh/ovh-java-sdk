package net.minidev.ovh.api.hosting.web.database;

/**
 * Database Type enum
 */
public enum OvhDatabaseTypeEnum {
	mysql("mysql"),
	postgresql("postgresql");

	final String value;

	OvhDatabaseTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
