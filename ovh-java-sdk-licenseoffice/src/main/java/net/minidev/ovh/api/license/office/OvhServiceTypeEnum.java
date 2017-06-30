package net.minidev.ovh.api.license.office;

/**
 * Type of service
 */
public enum OvhServiceTypeEnum {
	payAsYouGo("payAsYouGo"),
	prepaid("prepaid");

	final String value;

	OvhServiceTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
