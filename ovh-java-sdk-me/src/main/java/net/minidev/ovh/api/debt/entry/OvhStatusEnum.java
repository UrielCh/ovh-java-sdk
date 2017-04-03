package net.minidev.ovh.api.debt.entry;

/**
 * All status a debt entry can be in
 */
public enum OvhStatusEnum {
	CANCELLED("CANCELLED"),
	DONE("DONE"),
	FAILED("FAILED"),
	PAID("PAID"),
	PENDING("PENDING"),
	TODO("TODO");

	final String value;

	OvhStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
