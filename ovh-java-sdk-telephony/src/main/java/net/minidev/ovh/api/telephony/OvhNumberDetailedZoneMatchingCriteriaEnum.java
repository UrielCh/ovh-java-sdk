package net.minidev.ovh.api.telephony;

/**
 * The possible criteria matching a searched value for a zone
 */
public enum OvhNumberDetailedZoneMatchingCriteriaEnum {
	city("city"),
	internationalNumber("internationalNumber"),
	number("number"),
	zne("zne");

	final String value;

	OvhNumberDetailedZoneMatchingCriteriaEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
