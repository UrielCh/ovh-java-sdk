package net.minidev.ovh.api.telephony;

/**
 * Displayed number
 */
public enum OvhOvhPabxDialplanNumberPresentationEnum {
	alias("alias"),
	both("both"),
	caller("caller");

	final String value;

	OvhOvhPabxDialplanNumberPresentationEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
