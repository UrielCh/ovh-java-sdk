package net.minidev.ovh.api.telephony;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Type of screen list
 */
public enum OvhFaxScreenListTypeEnum {
	@JsonProperty("")
	_(""),
	blacklist("blacklist"),
	no("no"),
	whitelist("whitelist");

	final String value;

	OvhFaxScreenListTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
