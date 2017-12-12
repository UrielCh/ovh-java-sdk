package net.minidev.ovh.api.cloud.instanceregion;

/**
 * BootTypeEnum
 */
public enum OvhBootTypeEnum {
	image("image"),
	volume("volume");

	final String value;

	OvhBootTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
