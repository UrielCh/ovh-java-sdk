package net.minidev.ovh.api.cloud.image;

/**
 * OSTypeEnum
 */
public enum OvhOSTypeEnum {
	linux("linux"),
	bsd("bsd"),
	windows("windows");

	final String value;

	OvhOSTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
