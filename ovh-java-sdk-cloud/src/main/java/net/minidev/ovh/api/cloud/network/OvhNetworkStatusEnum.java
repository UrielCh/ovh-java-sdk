package net.minidev.ovh.api.cloud.network;

/**
 * NetworkStatusEnum
 */
public enum OvhNetworkStatusEnum {
	BUILDING("BUILDING"),
	ACTIVE("ACTIVE"),
	DELETING("DELETING");

	final String value;

	OvhNetworkStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
