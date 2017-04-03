package net.minidev.ovh.api.price.xdsl.options;

/**
 * Enum of Installations
 */
public enum OvhInstallationEnum {
	ipv4("ipv4");

	final String value;

	OvhInstallationEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
