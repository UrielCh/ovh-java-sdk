package net.minidev.ovh.api.dnssec;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Dnssec Algorithm
                        ###
                        3  : DSA
                        5  : RSASHA1
                        6  : DSA-NSEC3-SHA1
                        7  : RSASHA1-NSEC3-SHA1
                        8  : RSASHA256
                        10 : RSASHA512
                        13 : ECDSAP256SHA256
                        14 : ECDSAP384SHA384
 */
public enum OvhKeyAlgorithmEnum {
	@JsonProperty("10")
	_10("10"),
	@JsonProperty("13")
	_13("13"),
	@JsonProperty("14")
	_14("14"),
	@JsonProperty("3")
	_3("3"),
	@JsonProperty("5")
	_5("5"),
	@JsonProperty("6")
	_6("6"),
	@JsonProperty("7")
	_7("7"),
	@JsonProperty("8")
	_8("8");

	final String value;

	OvhKeyAlgorithmEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
