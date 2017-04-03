package net.minidev.ovh.api.ssl;

/**
 * All status a SSL operation can be in
 */
public enum OvhOperationStatusEnum {
	cancelled("cancelled"),
	doing("doing"),
	done("done"),
	error("error"),
	todo("todo");

	final String value;

	OvhOperationStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
