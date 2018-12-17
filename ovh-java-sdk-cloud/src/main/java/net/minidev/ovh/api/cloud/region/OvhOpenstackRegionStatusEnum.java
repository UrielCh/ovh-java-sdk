package net.minidev.ovh.api.cloud.region;

/**
 * OpenstackRegionStatusEnum
 */
public enum OvhOpenstackRegionStatusEnum {
	UP("UP"),
	DOWN("DOWN"),
	MAINTENANCE("MAINTENANCE");

	final String value;

	OvhOpenstackRegionStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
