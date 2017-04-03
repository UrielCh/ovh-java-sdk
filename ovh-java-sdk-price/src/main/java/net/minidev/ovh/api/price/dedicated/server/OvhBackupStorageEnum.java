package net.minidev.ovh.api.price.dedicated.server;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Enum of BackupStorages
 */
public enum OvhBackupStorageEnum {
	@JsonProperty("1000")
	_1000("1000"),
	@JsonProperty("10000")
	_10000("10000"),
	@JsonProperty("500")
	_500("500"),
	@JsonProperty("5000")
	_5000("5000");

	final String value;

	OvhBackupStorageEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
