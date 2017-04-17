package net.minidev.ovh.api.telephony;

/**
 * Phone protocol
 */
public enum OvhProtocolEnum {
	mgcp("mgcp"),
	sip("sip");

	final String value;

	OvhProtocolEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
