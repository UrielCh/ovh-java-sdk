package net.minidev.ovh.api.horizonview;

/**
 * Access Point type the customer can deploy
 */
public enum OvhAccessPointTypeEnum {
	privateAccessPoint("privateAccessPoint"),
	publicAccessPoint("publicAccessPoint");

	final String value;

	OvhAccessPointTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
