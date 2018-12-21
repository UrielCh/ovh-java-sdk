package net.minidev.ovh.api.cloud;

/**
 * Enum values for ContinentCode
 */
public enum OvhRegionContinent {
	EU("EU"),
	NA("NA"),
	US("US");

	final String value;

	OvhRegionContinent(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
