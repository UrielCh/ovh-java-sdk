package net.minidev.ovh.api.order.upgrade;

/**
 * Unit that represent the status of an operation
 */
public enum OvhOperationStatusEnum {
	TODO("TODO"),
	DOING("DOING"),
	DONE("DONE"),
	ERROR("ERROR"),
	DELAYED("DELAYED"),
	CANCELLED("CANCELLED"),
	SCHEDULED("SCHEDULED");

	final String value;

	OvhOperationStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
