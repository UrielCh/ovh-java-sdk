package net.minidev.ovh.api.price.hosting.web;

/**
 * Enum of Cdns
 */
public enum OvhCdnEnum {
	CDN_BUSINESS("CDN_BUSINESS");

	final String value;

	OvhCdnEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
