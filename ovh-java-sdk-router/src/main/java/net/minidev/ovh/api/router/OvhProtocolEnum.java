package net.minidev.ovh.api.router;

/**
 * Allowed protocols
 */
public enum OvhProtocolEnum {
	any("any"),
	tcp("tcp"),
	udp("udp");

	final String value;

	OvhProtocolEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
