package net.minidev.ovh.api.hosting.web.database;

/**
 * Indicates the current support state of your database version
 */
public enum OvhSupportedVersionEnum {
	beta("beta"),
	deprecated("deprecated"),
	stable("stable");

	final String value;

	OvhSupportedVersionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
