package net.minidev.ovh.api.cloud.project;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Possible values for volume type
 */
public enum OvhVolumeType {
	classic("classic"),
	@JsonProperty("high-speed")
	high_speed("high-speed");

	final String value;

	OvhVolumeType(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
