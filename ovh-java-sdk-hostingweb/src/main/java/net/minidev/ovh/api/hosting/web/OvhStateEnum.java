package net.minidev.ovh.api.hosting.web;

/**
 * Hosting's state
 */
public enum OvhStateEnum {
	active("active"),
	bloqued("bloqued"),
	maintenance("maintenance");

	final String value;

	OvhStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
