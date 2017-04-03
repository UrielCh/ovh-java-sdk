package net.minidev.ovh.api.cloud.ip;

/**
 * IpStatusEnum
 */
public enum OvhIpStatusEnum {
	ok("ok"),
	operationPending("operationPending");

	final String value;

	OvhIpStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
