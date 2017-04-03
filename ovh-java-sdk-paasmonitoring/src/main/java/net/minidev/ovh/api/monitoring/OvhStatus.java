package net.minidev.ovh.api.monitoring;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Monitoring Status
 */
public enum OvhStatus {
	@JsonProperty("NOT DEPLOYED")
	NOT_DEPLOYED("NOT DEPLOYED"),
	DEPLOYING("DEPLOYING"),
	OK("OK"),
	ERROR("ERROR"),
	DELETING("DELETING");

	final String value;

	OvhStatus(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
