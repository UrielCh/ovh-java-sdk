package net.minidev.ovh.api.iploadbalancing;

/**
 * Possible values for HTTP backend stickiness
 */
public enum OvhStickinessHTTPEnum {
	cookie("cookie"),
	sourceIp("sourceIp");

	final String value;

	OvhStickinessHTTPEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
