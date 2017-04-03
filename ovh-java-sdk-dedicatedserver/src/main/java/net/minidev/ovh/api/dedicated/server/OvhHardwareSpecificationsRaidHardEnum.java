package net.minidev.ovh.api.dedicated.server;

/**
 * Raid hard configuration
 */
public enum OvhHardwareSpecificationsRaidHardEnum {
	raid0("raid0"),
	raid1("raid1"),
	raid10("raid10"),
	raid1E("raid1E"),
	raid5("raid5"),
	raid50("raid50"),
	raid6("raid6"),
	raid60("raid60");

	final String value;

	OvhHardwareSpecificationsRaidHardEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
