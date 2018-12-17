package net.minidev.ovh.api.license;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * All versions available for Virtuozzo products
 */
public enum OvhOrderableVirtuozzoVersionEnum {
	VIRTUOZZO_CONTAINERS_4_FOR_LINUX("VIRTUOZZO_CONTAINERS_4_FOR_LINUX"),
	VIRTUOZZO_CONTAINERS_4_FOR_WINDOWS("VIRTUOZZO_CONTAINERS_4_FOR_WINDOWS"),
	@JsonProperty("virtuozzo-4")
	virtuozzo_4("virtuozzo-4"),
	@JsonProperty("virtuozzo-4-for-windows")
	virtuozzo_4_for_windows("virtuozzo-4-for-windows");

	final String value;

	OvhOrderableVirtuozzoVersionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
