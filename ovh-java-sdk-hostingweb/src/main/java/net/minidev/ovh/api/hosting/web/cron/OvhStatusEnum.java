package net.minidev.ovh.api.hosting.web.cron;

/**
 * Cron status
 */
public enum OvhStatusEnum {
	disabled("disabled"),
	enabled("enabled"),
	suspended("suspended");

	final String value;

	OvhStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
