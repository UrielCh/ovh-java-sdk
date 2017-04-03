package net.minidev.ovh.api.dedicated;

/**
 * enable or disable
 */
public enum OvhStatusEnum {
	disable("disable"),
	enable("enable");

	final String value;

	OvhStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
