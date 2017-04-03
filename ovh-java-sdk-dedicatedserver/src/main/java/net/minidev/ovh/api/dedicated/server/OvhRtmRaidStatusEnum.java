package net.minidev.ovh.api.dedicated.server;

/**
 *  Different RAID status
 */
public enum OvhRtmRaidStatusEnum {
	KO("KO"),
	OK("OK"),
	REBUILDING("REBUILDING"),
	UNKNOWN("UNKNOWN");

	final String value;

	OvhRtmRaidStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
