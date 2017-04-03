package net.minidev.ovh.api.api;

/**
 * List of state of an Api Application
 */
public enum OvhApplicationStatusEnum {
	active("active"),
	blocked("blocked"),
	inactive("inactive"),
	trusted("trusted");

	final String value;

	OvhApplicationStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
