package net.minidev.ovh.api.cdn.website;

/**
 * Value bandwidth or request
 */
public enum OvhStatsValueEnum {
	bandwidth("bandwidth"),
	request("request");

	final String value;

	OvhStatsValueEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
