package net.minidev.ovh.api.license;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Application set available for Plesk products
 */
public enum OvhPleskApplicationSetEnum {
	applicationpack("applicationpack"),
	developerpack("developerpack"),
	@JsonProperty("power-pack-for-plesk12")
	power_pack_for_plesk12("power-pack-for-plesk12"),
	powerpack("powerpack");

	final String value;

	OvhPleskApplicationSetEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
