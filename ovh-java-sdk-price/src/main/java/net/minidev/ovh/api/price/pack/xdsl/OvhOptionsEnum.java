package net.minidev.ovh.api.price.pack.xdsl;

/**
 * Enum of Optionss
 */
public enum OvhOptionsEnum {
	enterpriseGtr("enterpriseGtr"),
	vdslFt("vdslFt");

	final String value;

	OvhOptionsEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
