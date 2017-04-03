package net.minidev.ovh.api.price.pack.xdsl;

/**
 * Enum of Installations
 */
public enum OvhInstallationEnum {
	enterprise("enterprise"),
	express("express"),
	expressLite("expressLite");

	final String value;

	OvhInstallationEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
