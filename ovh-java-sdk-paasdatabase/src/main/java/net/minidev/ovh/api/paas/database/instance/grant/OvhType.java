package net.minidev.ovh.api.paas.database.instance.grant;

/**
 * Grant type
 */
public enum OvhType {
	admin("admin"),
	none("none"),
	ro("ro"),
	rw("rw");

	final String value;

	OvhType(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
