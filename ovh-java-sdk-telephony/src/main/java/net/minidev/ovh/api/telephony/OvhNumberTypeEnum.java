package net.minidev.ovh.api.telephony;

/**
 * Typology of number
 */
public enum OvhNumberTypeEnum {
	geographic("geographic"),
	nogeographic("nogeographic"),
	special("special");

	final String value;

	OvhNumberTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
