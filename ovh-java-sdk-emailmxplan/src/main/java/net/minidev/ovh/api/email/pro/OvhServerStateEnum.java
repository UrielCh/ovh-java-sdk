package net.minidev.ovh.api.email.pro;

/**
 * Server State
 */
public enum OvhServerStateEnum {
	configurationPending("configurationPending"),
	notConfigured("notConfigured"),
	ok("ok");

	final String value;

	OvhServerStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
