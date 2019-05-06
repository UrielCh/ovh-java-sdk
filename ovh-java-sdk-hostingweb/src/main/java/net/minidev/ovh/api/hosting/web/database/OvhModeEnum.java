package net.minidev.ovh.api.hosting.web.database;

/**
 * Database mode
 */
public enum OvhModeEnum {
	besteffort("besteffort"),
	classic("classic"),
	module("module");

	final String value;

	OvhModeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
