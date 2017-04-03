package net.minidev.ovh.api.dedicated.server;

/**
 * Dedicated server bandwidth burst
 */
public enum OvhBurstStatusEnum {
	active("active"),
	inactive("inactive"),
	inactiveLocked("inactiveLocked");

	final String value;

	OvhBurstStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
