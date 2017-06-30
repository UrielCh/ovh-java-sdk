package net.minidev.ovh.api.metrics.api;

/**
 * PermissionEnum
 */
public enum OvhPermissionEnum {
	read("read"),
	write("write");

	final String value;

	OvhPermissionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
