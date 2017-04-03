package net.minidev.ovh.api.xdsl.xdslmodemconfig;

/**
 * Type of protocol for the Port Mapping
 */
public enum OvhProtocolTypeEnum {
	TCP("TCP"),
	UDP("UDP");

	final String value;

	OvhProtocolTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
