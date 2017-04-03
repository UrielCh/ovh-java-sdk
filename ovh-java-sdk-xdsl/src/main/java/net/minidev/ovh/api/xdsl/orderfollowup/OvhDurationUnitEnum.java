package net.minidev.ovh.api.xdsl.orderfollowup;

/**
 * The duration units
 */
public enum OvhDurationUnitEnum {
	day("day"),
	hour("hour"),
	minute("minute");

	final String value;

	OvhDurationUnitEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
