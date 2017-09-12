package net.minidev.ovh.api.dedicated.server;

/**
 * Expansion card type enum
 */
public enum OvhHardwareSpecificationsExpansionCardTypeEnum {
	fpga("fpga"),
	gpu("gpu");

	final String value;

	OvhHardwareSpecificationsExpansionCardTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
