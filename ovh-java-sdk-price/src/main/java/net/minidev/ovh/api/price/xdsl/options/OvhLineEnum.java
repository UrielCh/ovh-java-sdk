package net.minidev.ovh.api.price.xdsl.options;

/**
 * Enum of Lines
 */
public enum OvhLineEnum {
	creation("creation"),
	partialToTotal("partialToTotal");

	final String value;

	OvhLineEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
