package net.minidev.ovh.api.cloud.ip;

/**
 * IpSubTypeEnum
 */
public enum OvhIpSubTypeEnum {
	cloud("cloud"),
	ovh("ovh");

	final String value;

	OvhIpSubTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
