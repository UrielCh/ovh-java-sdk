package net.minidev.ovh.api.dedicated;

/**
 * The region
 */
public enum OvhAvailabilityRegionEnum {
	europe("europe"),
	northAmerica("northAmerica");

	final String value;

	OvhAvailabilityRegionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
