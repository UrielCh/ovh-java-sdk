package net.minidev.ovh.api.dbaas.logs;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Possible values for ClusterRegionEnum
 */
public enum OvhClusterRegionEnum {
	GRA("GRA"),
	RBX("RBX"),
	BHS("BHS"),
	SBG("SBG"),
	@JsonProperty("P-19")
	P_19("P-19");

	final String value;

	OvhClusterRegionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
