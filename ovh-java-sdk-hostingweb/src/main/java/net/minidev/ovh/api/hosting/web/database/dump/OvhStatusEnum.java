package net.minidev.ovh.api.hosting.web.database.dump;

/**
 * Database dump status
 */
public enum OvhStatusEnum {
	created("created"),
	creating("creating"),
	deleting("deleting");

	final String value;

	OvhStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
