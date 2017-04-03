package net.minidev.ovh.api.tsaas;

/**
 * Tokens permissions
 */
public enum OvhPermissionEnum {
	READ("READ"),
	WRITE("WRITE");

	final String value;

	OvhPermissionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
