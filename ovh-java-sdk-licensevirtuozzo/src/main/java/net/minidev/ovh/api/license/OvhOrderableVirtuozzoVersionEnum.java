package net.minidev.ovh.api.license;

/**
 * All versions available for Virtuozzo products
 */
public enum OvhOrderableVirtuozzoVersionEnum {
	VIRTUOZZO_CONTAINERS_4_FOR_LINUX("VIRTUOZZO_CONTAINERS_4_FOR_LINUX"),
	VIRTUOZZO_CONTAINERS_4_FOR_WINDOWS("VIRTUOZZO_CONTAINERS_4_FOR_WINDOWS");

	final String value;

	OvhOrderableVirtuozzoVersionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
