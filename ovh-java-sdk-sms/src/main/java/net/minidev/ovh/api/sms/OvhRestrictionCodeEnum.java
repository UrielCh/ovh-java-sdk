package net.minidev.ovh.api.sms;

/**
 * Restriction type used by the operator to filter sms.
 */
public enum OvhRestrictionCodeEnum {
	ALPHA("ALPHA"),
	BAD_DLR("BAD_DLR"),
	BLOCKED("BLOCKED"),
	CODING("CODING"),
	DLR("DLR"),
	FLASHONLY("FLASHONLY"),
	MSISDN("MSISDN");

	final String value;

	OvhRestrictionCodeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
