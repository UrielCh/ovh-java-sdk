package net.minidev.ovh.api.dedicated;

/**
 * Os usage definition
 */
public enum OvhTemplateOsUsageEnum {
	basic("basic"),
	customer("customer"),
	hosting("hosting"),
	other("other"),
	readyToUse("readyToUse"),
	virtualisation("virtualisation");

	final String value;

	OvhTemplateOsUsageEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
