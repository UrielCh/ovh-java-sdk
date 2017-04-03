package net.minidev.ovh.api.cloud.network;

/**
 * NetworkRegionStatusEnum
 */
public enum OvhNetworkRegionStatusEnum {
	ACTIVE("ACTIVE"),
	BUILDING("BUILDING");

	final String value;

	OvhNetworkRegionStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
