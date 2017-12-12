package net.minidev.ovh.api.price.vps._2017v2.ssd;

/**
 * Enum of Options
 */
public enum OvhOptionEnum {
	additionalDisk100("additionalDisk100"),
	additionalDisk200("additionalDisk200"),
	additionalDisk50("additionalDisk50"),
	additionalDisk500("additionalDisk500"),
	ip("ip"),
	snapshot("snapshot");

	final String value;

	OvhOptionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
