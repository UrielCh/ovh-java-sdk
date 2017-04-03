package net.minidev.ovh.api.telephony;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Number of tries when sending a fax
 */
public enum OvhFaxSendingTries {
	@JsonProperty("1")
	_1("1"),
	@JsonProperty("2")
	_2("2"),
	@JsonProperty("3")
	_3("3"),
	@JsonProperty("4")
	_4("4"),
	@JsonProperty("5")
	_5("5"),
	@JsonProperty("6")
	_6("6"),
	@JsonProperty("7")
	_7("7"),
	@JsonProperty("8")
	_8("8"),
	@JsonProperty("9")
	_9("9");

	final String value;

	OvhFaxSendingTries(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
