package net.minidev.ovh.api.license.office;

/**
 * Office user  state
 */
public enum OvhUserStateEnum {
	creating("creating"),
	deleting("deleting"),
	ok("ok");

	final String value;

	OvhUserStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
