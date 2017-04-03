package net.minidev.ovh.api.order.upgrade;

/**
 * Unit that represent the type of an operation
 */
public enum OvhOperationTypeEnum {
	UPGRADE("UPGRADE");

	final String value;

	OvhOperationTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
