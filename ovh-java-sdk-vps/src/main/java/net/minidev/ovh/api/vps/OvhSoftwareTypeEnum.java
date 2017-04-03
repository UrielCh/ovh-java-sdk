package net.minidev.ovh.api.vps;

/**
 * Available Type for a vps Software
 */
public enum OvhSoftwareTypeEnum {
	database("database"),
	environment("environment"),
	webserver("webserver");

	final String value;

	OvhSoftwareTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
