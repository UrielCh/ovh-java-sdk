package net.minidev.ovh.api.iploadbalancing;

/**
 * Possible values for TCP backend stickiness
 */
public enum OvhStickinessTCPEnum {
	sourceIp("sourceIp");

	final String value;

	OvhStickinessTCPEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
