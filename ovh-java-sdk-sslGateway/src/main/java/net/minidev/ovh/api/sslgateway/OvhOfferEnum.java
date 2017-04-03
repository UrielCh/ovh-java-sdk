package net.minidev.ovh.api.sslgateway;

/**
 * List of SSL Gateway offers
 */
public enum OvhOfferEnum {
	advanced("advanced"),
	enterprise("enterprise"),
	free("free"),
	internal("internal");

	final String value;

	OvhOfferEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
