package net.minidev.ovh.api.dedicated.server;

/**
 * Required option
 */
public enum OvhOptionRequiredEnum {
	professionalUse("professionalUse");

	final String value;

	OvhOptionRequiredEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
