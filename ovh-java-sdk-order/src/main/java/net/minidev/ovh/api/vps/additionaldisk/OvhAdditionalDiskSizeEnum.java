package net.minidev.ovh.api.vps.additionaldisk;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Size of the additional disk in GB
 */
public enum OvhAdditionalDiskSizeEnum {
	@JsonProperty("100")
	_100("100"),
	@JsonProperty("200")
	_200("200"),
	@JsonProperty("50")
	_50("50"),
	@JsonProperty("500")
	_500("500");

	final String value;

	OvhAdditionalDiskSizeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
