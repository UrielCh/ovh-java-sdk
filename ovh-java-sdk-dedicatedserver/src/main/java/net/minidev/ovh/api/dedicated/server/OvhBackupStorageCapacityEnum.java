package net.minidev.ovh.api.dedicated.server;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Different backup storage capacity in gigabytes
 */
public enum OvhBackupStorageCapacityEnum {
	@JsonProperty("1000")
	_1000("1000"),
	@JsonProperty("10000")
	_10000("10000"),
	@JsonProperty("500")
	_500("500"),
	@JsonProperty("5000")
	_5000("5000");

	final String value;

	OvhBackupStorageCapacityEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
