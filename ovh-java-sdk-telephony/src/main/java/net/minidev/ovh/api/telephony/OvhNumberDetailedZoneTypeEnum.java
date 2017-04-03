package net.minidev.ovh.api.telephony;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A zone type
 */
public enum OvhNumberDetailedZoneTypeEnum {
	geographic("geographic"),
	@JsonProperty("non-geographic")
	non_geographic("non-geographic"),
	special("special");

	final String value;

	OvhNumberDetailedZoneTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
