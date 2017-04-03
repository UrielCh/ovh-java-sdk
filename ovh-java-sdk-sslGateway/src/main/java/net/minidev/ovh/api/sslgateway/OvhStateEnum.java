package net.minidev.ovh.api.sslgateway;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Possible values for SSL Gateway state
 */
public enum OvhStateEnum {
	creating("creating"),
	deleted("deleted"),
	deleting("deleting"),
	@JsonProperty("http-only")
	http_only("http-only"),
	internal("internal"),
	ok("ok"),
	suspended("suspended"),
	upgrading("upgrading");

	final String value;

	OvhStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
