package net.minidev.ovh.api.hosting.web;

/**
 * Dns zone modification possibilities when installing a new hosting
 */
public enum OvhDnsZoneEnum {
	NO_CHANGE("NO_CHANGE"),
	RESET_ALL("RESET_ALL"),
	RESET_ONLY_A("RESET_ONLY_A"),
	RESET_ONLY_MX("RESET_ONLY_MX");

	final String value;

	OvhDnsZoneEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
