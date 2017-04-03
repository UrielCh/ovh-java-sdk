package net.minidev.ovh.api.supply;

/**
 * Request status
 */
public enum OvhStatus {
	error("error"),
	ok("ok"),
	pending("pending");

	final String value;

	OvhStatus(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
