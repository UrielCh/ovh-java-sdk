package net.minidev.ovh.api.cloud;

/**
 * Possible values for project access type
 */
public enum OvhAccessTypeEnum {
	full("full"),
	restricted("restricted");

	final String value;

	OvhAccessTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
