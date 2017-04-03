package net.minidev.ovh.api.ip;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Possible values for action
 */
public enum OvhFirewallSequenceRangeEnum {
	@JsonProperty("0")
	_0("0"),
	@JsonProperty("1")
	_1("1"),
	@JsonProperty("10")
	_10("10"),
	@JsonProperty("11")
	_11("11"),
	@JsonProperty("12")
	_12("12"),
	@JsonProperty("13")
	_13("13"),
	@JsonProperty("14")
	_14("14"),
	@JsonProperty("15")
	_15("15"),
	@JsonProperty("16")
	_16("16"),
	@JsonProperty("17")
	_17("17"),
	@JsonProperty("18")
	_18("18"),
	@JsonProperty("19")
	_19("19"),
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

	OvhFirewallSequenceRangeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
