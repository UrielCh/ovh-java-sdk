package net.minidev.ovh.api.paas.database.instance.database.extension;

/**
 * Extension status
 */
public enum OvhStatus {
	disabled("disabled"),
	disabling("disabling"),
	enabled("enabled"),
	enabling("enabling");

	final String value;

	OvhStatus(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
