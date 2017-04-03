package net.minidev.ovh.api.hosting.web;

/**
 * Hosting's CDN offer
 */
public enum OvhCdnOfferEnum {
	CDN_BUSINESS("CDN_BUSINESS"),
	CDN_BUSINESS_FREE("CDN_BUSINESS_FREE");

	final String value;

	OvhCdnOfferEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
