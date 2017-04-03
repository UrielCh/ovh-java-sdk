package net.minidev.ovh.api.license;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * All versions for WorkLight product
 */
public enum OvhWorkLightVersionEnum {
	@JsonProperty("VERSION-6.1U.1CPU")
	VERSION_6_1U_1CPU("VERSION-6.1U.1CPU"),
	@JsonProperty("VERSION-6.1U.2CPU")
	VERSION_6_1U_2CPU("VERSION-6.1U.2CPU"),
	@JsonProperty("VERSION-6.2U.1CPU")
	VERSION_6_2U_1CPU("VERSION-6.2U.1CPU"),
	@JsonProperty("VERSION-6.2U.2CPU")
	VERSION_6_2U_2CPU("VERSION-6.2U.2CPU"),
	@JsonProperty("VERSION-6.EVALUATION")
	VERSION_6_EVALUATION("VERSION-6.EVALUATION");

	final String value;

	OvhWorkLightVersionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
