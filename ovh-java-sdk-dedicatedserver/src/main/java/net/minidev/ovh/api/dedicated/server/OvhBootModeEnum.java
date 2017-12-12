package net.minidev.ovh.api.dedicated.server;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Server boot mode
 */
public enum OvhBootModeEnum {
	legacy("legacy"),
	uefi("uefi"),
	@JsonProperty("uefi-legacy")
	uefi_legacy("uefi-legacy");

	final String value;

	OvhBootModeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
