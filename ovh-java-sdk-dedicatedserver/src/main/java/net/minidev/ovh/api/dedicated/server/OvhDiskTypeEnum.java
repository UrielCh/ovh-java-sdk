package net.minidev.ovh.api.dedicated.server;

/**
 * Disk interface type enum
 */
public enum OvhDiskTypeEnum {
	NVMe("NVMe"),
	SAS("SAS"),
	SATA("SATA"),
	SSD("SSD"),
	Unknown("Unknown");

	final String value;

	OvhDiskTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
