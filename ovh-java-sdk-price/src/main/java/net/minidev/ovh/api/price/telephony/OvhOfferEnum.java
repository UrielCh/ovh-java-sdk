package net.minidev.ovh.api.price.telephony;

/**
 * Enum of Offers
 */
public enum OvhOfferEnum {
	discovery("discovery"),
	enterprise("enterprise"),
	enterpriseMobile("enterpriseMobile"),
	resellerEnterprise("resellerEnterprise"),
	resellerEnterpriseMobile("resellerEnterpriseMobile");

	final String value;

	OvhOfferEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
