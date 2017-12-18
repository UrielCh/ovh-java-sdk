package net.minidev.ovh.api.hosting.web.envvar;

/**
 * EnvVar type
 */
public enum OvhTypeEnum {
	integer("integer"),
	password("password"),
	string("string");

	final String value;

	OvhTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
