package net.minidev.ovh.api.deskaas.user;

/**
 * All states a Dedicated Cloud User can be in
 */
public enum OvhStateEnum {
	creating("creating"),
	deleting("deleting"),
	delivered("delivered"),
	error("error");

	final String value;

	OvhStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
