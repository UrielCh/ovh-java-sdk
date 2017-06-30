package net.minidev.ovh.api.metrics.api;

/**
 * Type of the service
 */
public enum OvhOfferTypeEnum {
	cloud("cloud"),
	live("live");

	final String value;

	OvhOfferTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
