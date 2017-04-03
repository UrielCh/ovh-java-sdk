package net.minidev.ovh.api.dedicated.server;

/**
 * Distinct Installation status
 */
public enum OvhInstallationProgressStatusEnum {
	doing("doing"),
	done("done"),
	error("error"),
	expired("expired"),
	idle("idle"),
	pending("pending"),
	stopping("stopping"),
	todo("todo");

	final String value;

	OvhInstallationProgressStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
