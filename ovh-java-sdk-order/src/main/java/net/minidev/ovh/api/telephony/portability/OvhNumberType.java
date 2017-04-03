package net.minidev.ovh.api.telephony.portability;

/**
 * Type of number
 */
public enum OvhNumberType {
	landline("landline"),
	special("special");

	final String value;

	OvhNumberType(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
