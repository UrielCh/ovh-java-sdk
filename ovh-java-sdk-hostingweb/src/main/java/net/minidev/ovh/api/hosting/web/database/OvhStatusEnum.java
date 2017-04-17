package net.minidev.ovh.api.hosting.web.database;

/**
 * Database status
 */
public enum OvhStatusEnum {
	checking("checking"),
	created("created"),
	creating("creating"),
	deleting("deleting"),
	dumping("dumping"),
	importing("importing"),
	locked("locked"),
	optimizing("optimizing"),
	restoring("restoring"),
	updating("updating");

	final String value;

	OvhStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
