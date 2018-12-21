package net.minidev.ovh.api.hosting.web.runtime;

/**
 * Runtime env enum
 */
public enum OvhEnvEnum {
	development("development"),
	production("production");

	final String value;

	OvhEnvEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
