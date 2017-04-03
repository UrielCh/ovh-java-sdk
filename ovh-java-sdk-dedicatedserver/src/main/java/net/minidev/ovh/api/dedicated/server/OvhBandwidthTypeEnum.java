package net.minidev.ovh.api.dedicated.server;

/**
 *  Different Bandwidth type
 */
public enum OvhBandwidthTypeEnum {
	included("included"),
	platinum("platinum"),
	premium("premium"),
	standard("standard"),
	ultimate("ultimate");

	final String value;

	OvhBandwidthTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
