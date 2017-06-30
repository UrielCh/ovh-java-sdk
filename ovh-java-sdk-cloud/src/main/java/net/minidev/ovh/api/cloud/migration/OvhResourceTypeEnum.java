package net.minidev.ovh.api.cloud.migration;

/**
 * ResourceTypeEnum
 */
public enum OvhResourceTypeEnum {
	instance("instance");

	final String value;

	OvhResourceTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
