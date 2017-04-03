package net.minidev.ovh.api.dedicatedcloud.pcidss;

/**
 * States of a PCI-DSS option
 */
public enum OvhStateEnum {
	disabled("disabled"),
	disabling("disabling"),
	enabled("enabled"),
	enabling("enabling"),
	error("error"),
	unknown("unknown");

	final String value;

	OvhStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
