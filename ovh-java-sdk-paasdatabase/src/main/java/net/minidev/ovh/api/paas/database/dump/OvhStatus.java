package net.minidev.ovh.api.paas.database.dump;

/**
 * Dump status
 */
public enum OvhStatus {
	created("created"),
	creating("creating"),
	deleting("deleting");

	final String value;

	OvhStatus(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
