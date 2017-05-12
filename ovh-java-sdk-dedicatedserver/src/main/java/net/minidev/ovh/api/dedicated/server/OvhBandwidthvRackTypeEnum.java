package net.minidev.ovh.api.dedicated.server;

/**
 *  Different Bandwidth type
 */
public enum OvhBandwidthvRackTypeEnum {
	included("included"),
	standard("standard");

	final String value;

	OvhBandwidthvRackTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
