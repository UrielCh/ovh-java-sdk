package net.minidev.ovh.api.cloud.imageregion;

/**
 * ImageTypeEnum
 */
public enum OvhImageTypeEnum {
	windows("windows"),
	bsd("bsd"),
	linux("linux");

	final String value;

	OvhImageTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
