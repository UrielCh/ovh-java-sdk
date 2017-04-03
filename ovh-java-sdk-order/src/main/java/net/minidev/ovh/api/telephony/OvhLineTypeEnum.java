package net.minidev.ovh.api.telephony;

/**
 * Typology of number
 */
public enum OvhLineTypeEnum {
	geographic("geographic"),
	nogeographic("nogeographic");

	final String value;

	OvhLineTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
