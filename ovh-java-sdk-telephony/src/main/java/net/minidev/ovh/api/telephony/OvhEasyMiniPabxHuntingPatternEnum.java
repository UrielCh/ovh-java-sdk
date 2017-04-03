package net.minidev.ovh.api.telephony;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Calls dispatching pattern
 */
public enum OvhEasyMiniPabxHuntingPatternEnum {
	@JsonProperty("all-at-once")
	all_at_once("all-at-once"),
	cumulated("cumulated"),
	sequential("sequential");

	final String value;

	OvhEasyMiniPabxHuntingPatternEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
