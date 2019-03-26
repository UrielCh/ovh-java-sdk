package net.minidev.ovh.api.dedicated;

/**
 * Nas HA localization
 */
public enum OvhNasHAZoneEnum {
	bhs("bhs"),
	rbx("rbx"),
	sbg("sbg");

	final String value;

	OvhNasHAZoneEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
