package net.minidev.ovh.api.saas.csp2;

/**
 * Office CSP2 task status
 */
public enum OvhTaskStatusEnum {
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
