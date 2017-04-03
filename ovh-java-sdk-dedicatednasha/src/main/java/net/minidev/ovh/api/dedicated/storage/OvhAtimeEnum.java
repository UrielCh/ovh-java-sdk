package net.minidev.ovh.api.dedicated.storage;

/**
 * Atime values
 */
public enum OvhAtimeEnum {
	off("off"),
	on("on");

	final String value;

	OvhAtimeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
