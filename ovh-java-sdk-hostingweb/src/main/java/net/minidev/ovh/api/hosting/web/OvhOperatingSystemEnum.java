package net.minidev.ovh.api.hosting.web;

/**
 * Hosting's OS
 */
public enum OvhOperatingSystemEnum {
	linux("linux");

	final String value;

	OvhOperatingSystemEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
