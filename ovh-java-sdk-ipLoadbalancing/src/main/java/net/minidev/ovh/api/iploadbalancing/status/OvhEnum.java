package net.minidev.ovh.api.iploadbalancing.status;

/**
 * Possible values for a Load Balancer status
 */
public enum OvhEnum {
	error("error"),
	ok("ok"),
	unknown("unknown"),
	warn("warn");

	final String value;

	OvhEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
