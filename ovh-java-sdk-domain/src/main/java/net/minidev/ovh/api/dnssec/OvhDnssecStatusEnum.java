package net.minidev.ovh.api.dnssec;

/**
 * Dnssec Status
 */
public enum OvhDnssecStatusEnum {
	disableInProgress("disableInProgress"),
	disabled("disabled"),
	enableInProgress("enableInProgress"),
	enabled("enabled");

	final String value;

	OvhDnssecStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
