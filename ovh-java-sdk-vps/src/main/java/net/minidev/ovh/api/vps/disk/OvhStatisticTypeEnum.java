package net.minidev.ovh.api.vps.disk;

/**
 * Available types for the Disk monitoring and use
 */
public enum OvhStatisticTypeEnum {
	max("max"),
	used("used");

	final String value;

	OvhStatisticTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
