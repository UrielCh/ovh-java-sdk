package net.minidev.ovh.api.vps;

/**
 * Available restore types
 */
public enum OvhRestoreTypeEnum {
	file("file"),
	full("full");

	final String value;

	OvhRestoreTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
