package net.minidev.ovh.api.hosting.web.ovhconfig;

/**
 * Hosting configuration environment
 */
public enum OvhEnvironmentEnum {
	development("development"),
	production("production");

	final String value;

	OvhEnvironmentEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
