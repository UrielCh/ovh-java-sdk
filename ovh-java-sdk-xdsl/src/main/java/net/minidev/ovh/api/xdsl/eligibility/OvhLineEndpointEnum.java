package net.minidev.ovh.api.xdsl.eligibility;

/**
 * Type of the endpoint for the eligibility
 */
public enum OvhLineEndpointEnum {
	address("address"),
	line("line");

	final String value;

	OvhLineEndpointEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
