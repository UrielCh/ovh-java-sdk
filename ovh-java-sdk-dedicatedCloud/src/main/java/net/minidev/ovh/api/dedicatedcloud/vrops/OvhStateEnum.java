package net.minidev.ovh.api.dedicatedcloud.vrops;

/**
 * States of a vRealize Operations option
 */
public enum OvhStateEnum {
	disabled("disabled"),
	disabling("disabling"),
	enabled("enabled"),
	enabling("enabling"),
	error("error"),
	migrating("migrating"),
	unknown("unknown");

	final String value;

	OvhStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
