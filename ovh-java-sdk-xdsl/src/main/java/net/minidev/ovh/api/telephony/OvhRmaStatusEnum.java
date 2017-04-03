package net.minidev.ovh.api.telephony;

/**
 * Return merchandise authorisation step
 */
public enum OvhRmaStatusEnum {
	closed("closed"),
	open("open"),
	received("received");

	final String value;

	OvhRmaStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
