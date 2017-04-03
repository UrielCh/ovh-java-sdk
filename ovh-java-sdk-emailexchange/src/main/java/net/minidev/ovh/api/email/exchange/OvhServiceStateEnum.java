package net.minidev.ovh.api.email.exchange;

/**
 * Exchange Service State
 */
public enum OvhServiceStateEnum {
	inMaintenance("inMaintenance"),
	ok("ok"),
	suspended("suspended");

	final String value;

	OvhServiceStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
