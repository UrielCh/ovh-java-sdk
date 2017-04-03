package net.minidev.ovh.api.xdsl;

/**
 * Possible DSL technologies
 */
public enum OvhDslTypeEnum {
	adsl("adsl"),
	sdsl("sdsl"),
	vdsl("vdsl");

	final String value;

	OvhDslTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
