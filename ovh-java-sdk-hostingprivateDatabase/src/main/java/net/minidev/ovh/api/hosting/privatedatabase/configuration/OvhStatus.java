package net.minidev.ovh.api.hosting.privatedatabase.configuration;

/**
 * Configuration status
 */
public enum OvhStatus {
	applied("applied"),
	updating("updating");

	final String value;

	OvhStatus(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
