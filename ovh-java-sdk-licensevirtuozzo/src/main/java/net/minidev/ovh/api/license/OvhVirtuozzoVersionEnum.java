package net.minidev.ovh.api.license;

/**
 * All versions available for Virtuozzo products
 */
public enum OvhVirtuozzoVersionEnum {
	VIRTUOZZO_CONTAINERS_4_FOR_LINUX("VIRTUOZZO_CONTAINERS_4_FOR_LINUX"),
	VIRTUOZZO_CONTAINERS_4_FOR_WINDOWS("VIRTUOZZO_CONTAINERS_4_FOR_WINDOWS");

	final String value;

	OvhVirtuozzoVersionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
