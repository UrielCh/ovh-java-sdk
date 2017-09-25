package net.minidev.ovh.api.service.renew;

/**
 * Mode enum informations
 */
public enum OvhMode {
	automaticForcedProduct("automaticForcedProduct"),
	automaticV2012("automaticV2012"),
	automaticV2014("automaticV2014"),
	automaticV2016("automaticV2016"),
	deleteAtEndEngagement("deleteAtEndEngagement"),
	deleteAtExpiration("deleteAtExpiration"),
	manual("manual"),
	oneShot("oneShot"),
	option("option");

	final String value;

	OvhMode(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
