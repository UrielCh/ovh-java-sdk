package net.minidev.ovh.api.xdsl;

/**
 * Status of the service
 */
public enum OvhServiceStatusEnum {
	disabled("disabled"),
	enabled("enabled");

	final String value;

	OvhServiceStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
