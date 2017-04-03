package net.minidev.ovh.api.cdnanycast;

/**
 * Type of statistics related to cache
 */
public enum OvhStatsTypeEnum {
	backend("backend"),
	cdn("cdn"),
	threat("threat");

	final String value;

	OvhStatsTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
