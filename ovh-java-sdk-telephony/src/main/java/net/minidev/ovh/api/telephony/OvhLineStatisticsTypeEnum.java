package net.minidev.ovh.api.telephony;

/**
 * Types of statistics available for a line.
 */
public enum OvhLineStatisticsTypeEnum {
	maxDelay("maxDelay"),
	maxJitter("maxJitter"),
	rtpMos("rtpMos"),
	sumRtpLost("sumRtpLost");

	final String value;

	OvhLineStatisticsTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
