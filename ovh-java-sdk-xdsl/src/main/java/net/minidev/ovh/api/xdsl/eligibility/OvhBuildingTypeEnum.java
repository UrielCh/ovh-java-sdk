package net.minidev.ovh.api.xdsl.eligibility;

/**
 * Type of building
 */
public enum OvhBuildingTypeEnum {
	BUILDING("BUILDING"),
	HOUSE("HOUSE");

	final String value;

	OvhBuildingTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
