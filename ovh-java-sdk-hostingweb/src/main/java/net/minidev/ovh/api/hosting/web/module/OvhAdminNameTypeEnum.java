package net.minidev.ovh.api.hosting.web.module;

/**
 * The type of the admin name
 */
public enum OvhAdminNameTypeEnum {
	email("email"),
	string("string");

	final String value;

	OvhAdminNameTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
