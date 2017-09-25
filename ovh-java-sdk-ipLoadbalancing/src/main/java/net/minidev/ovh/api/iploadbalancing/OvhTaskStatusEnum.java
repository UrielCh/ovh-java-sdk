package net.minidev.ovh.api.iploadbalancing;

/**
 * Possible task status
 */
public enum OvhTaskStatusEnum {
	blocked("blocked"),
	cancelled("cancelled"),
	doing("doing"),
	done("done"),
	error("error"),
	todo("todo");

	final String value;

	OvhTaskStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
