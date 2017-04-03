package net.minidev.ovh.api.license;

/**
 * All versions available for Cpanel products
 */
public enum OvhOrderableCpanelVersionEnum {
	VERSION_11_FOR_LINUX("VERSION_11_FOR_LINUX"),
	VERSION_11_FOR_VIRTUOZZO("VERSION_11_FOR_VIRTUOZZO"),
	VERSION_11_FOR_VPS("VERSION_11_FOR_VPS");

	final String value;

	OvhOrderableCpanelVersionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
