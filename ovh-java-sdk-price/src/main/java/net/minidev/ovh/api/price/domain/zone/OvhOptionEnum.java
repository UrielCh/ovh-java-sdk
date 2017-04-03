package net.minidev.ovh.api.price.domain.zone;

/**
 * Enum of Options
 */
public enum OvhOptionEnum {
	dnsAnycast("dnsAnycast");

	final String value;

	OvhOptionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
