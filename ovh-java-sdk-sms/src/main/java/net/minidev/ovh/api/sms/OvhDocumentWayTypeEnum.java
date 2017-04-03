package net.minidev.ovh.api.sms;

/**
 * Way type
 */
public enum OvhDocumentWayTypeEnum {
	incoming("incoming"),
	outgoing("outgoing");

	final String value;

	OvhDocumentWayTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
