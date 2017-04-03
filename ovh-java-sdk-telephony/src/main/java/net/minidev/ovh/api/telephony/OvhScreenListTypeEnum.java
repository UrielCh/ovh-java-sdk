package net.minidev.ovh.api.telephony;

/**
 * Type of screen list
 */
public enum OvhScreenListTypeEnum {
	incomingBlackList("incomingBlackList"),
	incomingWhiteList("incomingWhiteList"),
	outgoingBlackList("outgoingBlackList"),
	outgoingWhiteList("outgoingWhiteList");

	final String value;

	OvhScreenListTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
