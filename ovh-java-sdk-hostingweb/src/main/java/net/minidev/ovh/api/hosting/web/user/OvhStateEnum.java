package net.minidev.ovh.api.hosting.web.user;

/**
 * Account's state
 */
public enum OvhStateEnum {
	off("off"),
	rw("rw");

	final String value;

	OvhStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
