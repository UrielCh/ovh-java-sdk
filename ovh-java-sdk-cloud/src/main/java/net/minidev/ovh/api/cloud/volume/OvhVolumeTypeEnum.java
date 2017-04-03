package net.minidev.ovh.api.cloud.volume;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VolumeTypeEnum
 */
public enum OvhVolumeTypeEnum {
	classic("classic"),
	@JsonProperty("high-speed")
	high_speed("high-speed");

	final String value;

	OvhVolumeTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
