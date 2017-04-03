package net.minidev.ovh.api.xdsl;

/**
 * AsyncTask status
 */
public enum OvhAsyncTaskStatusEnum {
	error("error"),
	ok("ok"),
	pending("pending");

	final String value;

	OvhAsyncTaskStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
