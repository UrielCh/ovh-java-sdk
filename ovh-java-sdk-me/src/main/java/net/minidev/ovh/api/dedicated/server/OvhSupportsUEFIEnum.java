package net.minidev.ovh.api.dedicated.server;

/**
 * supports UEFI setup
 */
public enum OvhSupportsUEFIEnum {
	no("no"),
	only("only"),
	yes("yes");

	final String value;

	OvhSupportsUEFIEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
