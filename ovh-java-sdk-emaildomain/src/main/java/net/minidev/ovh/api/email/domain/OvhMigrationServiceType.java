package net.minidev.ovh.api.email.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Types of migration service
 */
public enum OvhMigrationServiceType {
	@JsonProperty("EMAIL PRO")
	EMAIL_PRO("EMAIL PRO"),
	@JsonProperty("HOSTED EXCHANGE")
	HOSTED_EXCHANGE("HOSTED EXCHANGE");

	final String value;

	OvhMigrationServiceType(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
