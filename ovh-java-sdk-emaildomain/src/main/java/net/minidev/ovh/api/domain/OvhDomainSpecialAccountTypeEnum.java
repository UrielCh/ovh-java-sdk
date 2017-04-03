package net.minidev.ovh.api.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Possible type task
 */
public enum OvhDomainSpecialAccountTypeEnum {
	@JsonProperty("25g")
	_25g("25g"),
	alias("alias"),
	delete("delete"),
	filter("filter"),
	forward("forward"),
	responder("responder");

	final String value;

	OvhDomainSpecialAccountTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
