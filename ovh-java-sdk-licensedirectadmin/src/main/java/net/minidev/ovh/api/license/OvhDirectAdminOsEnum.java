package net.minidev.ovh.api.license;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * All operating systems available for DirectAdmin products
 */
public enum OvhDirectAdminOsEnum {
	@JsonProperty("CentOs_5.0_32")
	CentOs_5_0_32("CentOs_5.0_32"),
	@JsonProperty("CentOs_5.0_64")
	CentOs_5_0_64("CentOs_5.0_64"),
	CentOs_6_32("CentOs_6_32"),
	CentOs_6_64("CentOs_6_64"),
	CentOs_7_64("CentOs_7_64"),
	@JsonProperty("Debian_5.0_32")
	Debian_5_0_32("Debian_5.0_32"),
	@JsonProperty("Debian_5.0_64")
	Debian_5_0_64("Debian_5.0_64"),
	@JsonProperty("Debian_6.0_32")
	Debian_6_0_32("Debian_6.0_32"),
	@JsonProperty("Debian_6.0_64")
	Debian_6_0_64("Debian_6.0_64"),
	@JsonProperty("Debian_7.0_32")
	Debian_7_0_32("Debian_7.0_32"),
	@JsonProperty("Debian_7.0_64")
	Debian_7_0_64("Debian_7.0_64"),
	@JsonProperty("Debian_8.0_64")
	Debian_8_0_64("Debian_8.0_64"),
	@JsonProperty("FreeBSD_7.x_32")
	FreeBSD_7_x_32("FreeBSD_7.x_32"),
	@JsonProperty("FreeBSD_7.x_64")
	FreeBSD_7_x_64("FreeBSD_7.x_64"),
	@JsonProperty("FreeBSD_8.x_64")
	FreeBSD_8_x_64("FreeBSD_8.x_64"),
	@JsonProperty("FreeBSD_9.x_64")
	FreeBSD_9_x_64("FreeBSD_9.x_64");

	final String value;

	OvhDirectAdminOsEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
