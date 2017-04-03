package net.minidev.ovh.api.saas.csp2;

/**
 * Office tenant state
 */
public enum OvhServiceStateEnum {
	creating("creating"),
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
