package net.minidev.ovh.api.paas.database;

/**
 * Paas database status
 */
public enum OvhStatus {
	created("created"),
	creating("creating"),
	deleting("deleting"),
	reopening("reopening"),
	suspended("suspended"),
	suspending("suspending");

	final String value;

	OvhStatus(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
