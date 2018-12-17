package net.minidev.ovh.api.connectivity.eligibility;

/**
 * Endpoint reference type
 */
public enum OvhEndpointReferenceTypeEnum {
	building("building"),
	lineNumber("lineNumber"),
	otp("otp");

	final String value;

	OvhEndpointReferenceTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
