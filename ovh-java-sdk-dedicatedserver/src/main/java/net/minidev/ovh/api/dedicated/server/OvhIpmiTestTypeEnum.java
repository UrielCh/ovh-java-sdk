package net.minidev.ovh.api.dedicated.server;

/**
 * Different test can be made on IPMI interface
 */
public enum OvhIpmiTestTypeEnum {
	http("http"),
	password("password"),
	ping("ping");

	final String value;

	OvhIpmiTestTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
