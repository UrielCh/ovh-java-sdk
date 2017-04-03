package net.minidev.ovh.api.timeseries;

/**
 * The current status for the project
 */
public enum OvhStatusTypeEnum {
	ACTIVE("ACTIVE"),
	CREATION("CREATION"),
	DELETED("DELETED"),
	UNCONFIGURED("UNCONFIGURED");

	final String value;

	OvhStatusTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
