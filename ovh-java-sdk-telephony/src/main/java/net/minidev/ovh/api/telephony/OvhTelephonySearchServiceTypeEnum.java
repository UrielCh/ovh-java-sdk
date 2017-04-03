package net.minidev.ovh.api.telephony;

/**
 * List of possible type of a telephony service
 */
public enum OvhTelephonySearchServiceTypeEnum {
	alias("alias"),
	line("line");

	final String value;

	OvhTelephonySearchServiceTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
