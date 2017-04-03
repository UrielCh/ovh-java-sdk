package net.minidev.ovh.api.price.xdsl;

/**
 * Enum of Installations
 */
public enum OvhInstallationEnum {
	backup("backup");

	final String value;

	OvhInstallationEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
