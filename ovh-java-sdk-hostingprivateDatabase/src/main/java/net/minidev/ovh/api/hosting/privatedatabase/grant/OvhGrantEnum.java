package net.minidev.ovh.api.hosting.privatedatabase.grant;

/**
 * Grant on a database for a specific user
 */
public enum OvhGrantEnum {
	admin("admin"),
	none("none"),
	ro("ro"),
	rw("rw");

	final String value;

	OvhGrantEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
