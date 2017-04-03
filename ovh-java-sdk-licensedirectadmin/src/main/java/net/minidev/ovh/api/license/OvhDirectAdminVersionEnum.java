package net.minidev.ovh.api.license;

/**
 * All versions for DirectAdmin products
 */
public enum OvhDirectAdminVersionEnum {
	DIRECTADMIN_1("DIRECTADMIN_1");

	final String value;

	OvhDirectAdminVersionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
