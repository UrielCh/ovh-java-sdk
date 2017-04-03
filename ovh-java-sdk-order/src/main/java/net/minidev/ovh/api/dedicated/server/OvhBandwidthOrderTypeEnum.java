package net.minidev.ovh.api.dedicated.server;

/**
 *  Different Bandwidth type orderable
 */
public enum OvhBandwidthOrderTypeEnum {
	platinum("platinum"),
	premium("premium"),
	ultimate("ultimate");

	final String value;

	OvhBandwidthOrderTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
