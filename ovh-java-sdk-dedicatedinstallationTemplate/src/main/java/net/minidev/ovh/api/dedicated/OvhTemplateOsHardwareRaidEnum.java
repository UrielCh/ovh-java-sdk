package net.minidev.ovh.api.dedicated;

/**
 * Hardware RAID enum
 */
public enum OvhTemplateOsHardwareRaidEnum {
	raid0("raid0"),
	raid1("raid1"),
	raid10("raid10"),
	raid5("raid5"),
	raid50("raid50"),
	raid6("raid6"),
	raid60("raid60");

	final String value;

	OvhTemplateOsHardwareRaidEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
