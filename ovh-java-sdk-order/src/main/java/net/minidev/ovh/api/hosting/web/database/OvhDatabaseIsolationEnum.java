package net.minidev.ovh.api.hosting.web.database;

/**
 * Database Isolation enum
 */
public enum OvhDatabaseIsolationEnum {
	dedicated("dedicated"),
	local("local"),
	shared("shared");

	final String value;

	OvhDatabaseIsolationEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
