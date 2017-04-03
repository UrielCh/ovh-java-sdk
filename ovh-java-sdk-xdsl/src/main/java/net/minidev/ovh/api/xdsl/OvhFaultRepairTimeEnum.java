package net.minidev.ovh.api.xdsl;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Maximum time needed to repair a landline
 */
public enum OvhFaultRepairTimeEnum {
	@JsonProperty("4HNO")
	_4HNO("4HNO"),
	@JsonProperty("4HO")
	_4HO("4HO"),
	NORMAL("NORMAL");

	final String value;

	OvhFaultRepairTimeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
