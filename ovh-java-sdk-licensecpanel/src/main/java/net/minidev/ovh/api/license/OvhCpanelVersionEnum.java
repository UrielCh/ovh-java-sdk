package net.minidev.ovh.api.license;

/**
 * All versions available for Cpanel products
 */
public enum OvhCpanelVersionEnum {
	VERSION_11_FOR_LINUX("VERSION_11_FOR_LINUX"),
	VERSION_11_FOR_VIRTUOZZO("VERSION_11_FOR_VIRTUOZZO"),
	VERSION_11_FOR_VPS("VERSION_11_FOR_VPS");

	final String value;

	OvhCpanelVersionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
