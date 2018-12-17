package net.minidev.ovh.api.license;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * All versions available for Cpanel products
 */
public enum OvhOrderableCpanelVersionEnum {
	VERSION_11_FOR_LINUX("VERSION_11_FOR_LINUX"),
	VERSION_11_FOR_VIRTUOZZO("VERSION_11_FOR_VIRTUOZZO"),
	VERSION_11_FOR_VPS("VERSION_11_FOR_VPS"),
	@JsonProperty("cpanel-license-version-11")
	cpanel_license_version_11("cpanel-license-version-11"),
	@JsonProperty("cpanel-license-version-11-for-virtuozzo")
	cpanel_license_version_11_for_virtuozzo("cpanel-license-version-11-for-virtuozzo"),
	@JsonProperty("cpanel-license-version-11-for-vps")
	cpanel_license_version_11_for_vps("cpanel-license-version-11-for-vps");

	final String value;

	OvhOrderableCpanelVersionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
