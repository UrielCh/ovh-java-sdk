package net.minidev.ovh.api.sslgateway;

/**
 * Possible task status
 */
public enum OvhTaskStatusEnum {
	blocked("blocked"),
	cancelled("cancelled"),
	doing("doing"),
	done("done"),
	error("error"),
	paused("paused"),
	todo("todo");

	final String value;

	OvhTaskStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
