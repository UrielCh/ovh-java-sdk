package net.minidev.ovh.api.msservices;

/**
 * Service State
 */
public enum OvhServiceStateEnum {
	creating("creating"),
	deleting("deleting"),
	inMaintenance("inMaintenance"),
	ok("ok"),
	suspended("suspended");

	final String value;

	OvhServiceStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
