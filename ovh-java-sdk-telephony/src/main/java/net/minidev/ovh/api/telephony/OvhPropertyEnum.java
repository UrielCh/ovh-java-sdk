package net.minidev.ovh.api.telephony;

/**
 * All existing properties of line or alias offer
 */
public enum OvhPropertyEnum {
	xdsl("xdsl");

	final String value;

	OvhPropertyEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
