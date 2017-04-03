package net.minidev.ovh.api.license;

/**
 * All states a license can be in
 */
public enum OvhStateEnum {
	ok("ok"),
	released("released"),
	terminated("terminated"),
	toDeliver("toDeliver");

	final String value;

	OvhStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
