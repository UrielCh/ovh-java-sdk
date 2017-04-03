package net.minidev.ovh.api.dedicated.ceph.poollist.response;

/**
 * Type of pool
 */
public enum OvhPoolTypeEnum {
	REPLICATED("REPLICATED"),
	ERASURE_CODED("ERASURE_CODED");

	final String value;

	OvhPoolTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
