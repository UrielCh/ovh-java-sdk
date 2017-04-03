package net.minidev.ovh.api.telephony;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Time zones available for scheduled events time definitions
 */
public enum OvhTimeZone {
	@JsonProperty("Europe/Berlin")
	Europe_Berlin("Europe/Berlin"),
	@JsonProperty("Europe/Brussels")
	Europe_Brussels("Europe/Brussels"),
	@JsonProperty("Europe/London")
	Europe_London("Europe/London"),
	@JsonProperty("Europe/Madrid")
	Europe_Madrid("Europe/Madrid"),
	@JsonProperty("Europe/Paris")
	Europe_Paris("Europe/Paris"),
	@JsonProperty("Europe/Zurich")
	Europe_Zurich("Europe/Zurich");

	final String value;

	OvhTimeZone(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
