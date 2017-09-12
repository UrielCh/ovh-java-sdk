package net.minidev.ovh.api.cloud.storage;

/**
 * RightEnum
 */
public enum OvhRightEnum {
	all("all"),
	read("read"),
	write("write");

	final String value;

	OvhRightEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
