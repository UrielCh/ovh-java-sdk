package net.minidev.ovh.api.hosting.web;

/**
 * Hosting's type
 */
public enum OvhResourceEnum {
	bestEffort("bestEffort"),
	dedicated("dedicated"),
	shared("shared");

	final String value;

	OvhResourceEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
