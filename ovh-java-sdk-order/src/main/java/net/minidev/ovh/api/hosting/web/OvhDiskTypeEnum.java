package net.minidev.ovh.api.hosting.web;

/**
 * Disk type available
 */
public enum OvhDiskTypeEnum {
	HDD("HDD"),
	SSD("SSD");

	final String value;

	OvhDiskTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
