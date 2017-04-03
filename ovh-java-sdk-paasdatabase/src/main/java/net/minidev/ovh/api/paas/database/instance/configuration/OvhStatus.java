package net.minidev.ovh.api.paas.database.instance.configuration;

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
