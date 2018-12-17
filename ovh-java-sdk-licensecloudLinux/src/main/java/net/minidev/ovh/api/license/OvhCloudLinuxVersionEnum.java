package net.minidev.ovh.api.license;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * All versions for CloudLinux product
 */
public enum OvhCloudLinuxVersionEnum {
	SINGLE("SINGLE"),
	WITH_CPANEL("WITH_CPANEL"),
	WITH_PLESK12("WITH_PLESK12"),
	@JsonProperty("cloudlinux-license")
	cloudlinux_license("cloudlinux-license");

	final String value;

	OvhCloudLinuxVersionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
