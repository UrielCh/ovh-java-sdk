package net.minidev.ovh.api.sslgateway;

/**
 * Possible values for SSL Gateway server state
 */
public enum OvhServerStateEnum {
	creating("creating"),
	deleted("deleted"),
	deleting("deleting"),
	internal("internal"),
	ok("ok"),
	updating("updating");

	final String value;

	OvhServerStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
