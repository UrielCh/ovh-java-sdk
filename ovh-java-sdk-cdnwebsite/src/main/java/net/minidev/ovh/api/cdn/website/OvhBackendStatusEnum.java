package net.minidev.ovh.api.cdn.website;

/**
 * All states a status can be in
 */
public enum OvhBackendStatusEnum {
	creating("creating"),
	error("error"),
	on("on"),
	removing("removing");

	final String value;

	OvhBackendStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
