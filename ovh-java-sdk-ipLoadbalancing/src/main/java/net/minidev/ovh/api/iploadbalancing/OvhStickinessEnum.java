package net.minidev.ovh.api.iploadbalancing;

/**
 * Possible values for backend stickiness
 */
public enum OvhStickinessEnum {
	cookie("cookie"),
	sourceIp("sourceIp");

	final String value;

	OvhStickinessEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
