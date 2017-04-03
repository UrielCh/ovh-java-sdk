package net.minidev.ovh.api.dedicated.server;

/**
 * All states a Dedicated can in
 */
public enum OvhStateEnum {
	error("error"),
	hacked("hacked"),
	hackedBlocked("hackedBlocked"),
	ok("ok");

	final String value;

	OvhStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
