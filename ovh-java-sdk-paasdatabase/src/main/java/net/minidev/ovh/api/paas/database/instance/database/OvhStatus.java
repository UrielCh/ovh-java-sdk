package net.minidev.ovh.api.paas.database.instance.database;

/**
 * Database status
 */
public enum OvhStatus {
	created("created"),
	creating("creating"),
	deleting("deleting"),
	dumping("dumping"),
	importing("importing"),
	restoring("restoring");

	final String value;

	OvhStatus(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
