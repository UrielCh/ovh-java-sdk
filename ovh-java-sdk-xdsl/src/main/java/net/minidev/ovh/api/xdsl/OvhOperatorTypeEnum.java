package net.minidev.ovh.api.xdsl;

/**
 * Operators
 */
public enum OvhOperatorTypeEnum {
	collect("collect"),
	kosc("kosc"),
	ovh("ovh");

	final String value;

	OvhOperatorTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
