package net.minidev.ovh.api.hosting.web.runtime;

/**
 * Runtime state enum
 */
public enum OvhStateEnum {
	created("created"),
	creating("creating"),
	deleting("deleting"),
	updating("updating");

	final String value;

	OvhStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
