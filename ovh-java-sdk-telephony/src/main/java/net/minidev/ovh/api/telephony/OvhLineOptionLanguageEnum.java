package net.minidev.ovh.api.telephony;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The language of the line
 */
public enum OvhLineOptionLanguageEnum {
	Dutch("Dutch"),
	@JsonProperty("English (UK)")
	English__UK_("English (UK)"),
	French("French"),
	@JsonProperty("French (BE)")
	French__BE_("French (BE)"),
	German("German"),
	Italian("Italian"),
	Spanish("Spanish");

	final String value;

	OvhLineOptionLanguageEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
