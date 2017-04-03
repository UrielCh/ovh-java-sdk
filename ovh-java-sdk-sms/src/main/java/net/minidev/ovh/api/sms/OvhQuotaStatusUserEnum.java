package net.minidev.ovh.api.sms;

/**
 * Current quota status
 */
public enum OvhQuotaStatusUserEnum {
	active("active"),
	inactive("inactive");

	final String value;

	OvhQuotaStatusUserEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
