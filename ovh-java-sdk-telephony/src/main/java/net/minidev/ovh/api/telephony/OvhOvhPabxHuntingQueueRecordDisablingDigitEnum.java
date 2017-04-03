package net.minidev.ovh.api.telephony;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Digit keys allowed to be pressed to disable call record
 */
public enum OvhOvhPabxHuntingQueueRecordDisablingDigitEnum {
	@JsonProperty("0")
	_0("0"),
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

	OvhOvhPabxHuntingQueueRecordDisablingDigitEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
