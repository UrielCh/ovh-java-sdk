package net.minidev.ovh.api.sslgateway;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Possible values for SSL Gateway domain state
 */
public enum OvhDomainStateEnum {
	creating("creating"),
	deleted("deleted"),
	deleting("deleting"),
	@JsonProperty("http-only")
	http_only("http-only"),
	internal("internal"),
	ok("ok");

	final String value;

	OvhDomainStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
