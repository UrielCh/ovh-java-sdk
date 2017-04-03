package net.minidev.ovh.api.license;

/**
 * All versions available for DirectAdmin products
 */
public enum OvhOrderableDirectAdminVersionEnum {
	DIRECTADMIN_1("DIRECTADMIN_1");

	final String value;

	OvhOrderableDirectAdminVersionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
