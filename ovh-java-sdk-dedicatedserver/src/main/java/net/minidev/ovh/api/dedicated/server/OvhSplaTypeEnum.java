package net.minidev.ovh.api.dedicated.server;

/**
 * SPLA license type
 */
public enum OvhSplaTypeEnum {
	os("os"),
	sqlstd("sqlstd"),
	sqlweb("sqlweb");

	final String value;

	OvhSplaTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
