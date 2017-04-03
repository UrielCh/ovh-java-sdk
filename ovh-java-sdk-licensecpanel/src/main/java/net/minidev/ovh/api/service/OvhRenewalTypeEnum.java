package net.minidev.ovh.api.service;

/**
 * Detailed renewal type of a service
 */
public enum OvhRenewalTypeEnum {
	automaticForcedProduct("automaticForcedProduct"),
	automaticV2012("automaticV2012"),
	automaticV2014("automaticV2014"),
	automaticV2016("automaticV2016"),
	manual("manual"),
	oneShot("oneShot"),
	option("option");

	final String value;

	OvhRenewalTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
