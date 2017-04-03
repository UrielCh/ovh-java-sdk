package net.minidev.ovh.api.telephony;

/**
 * Country that defines the portability kind
 */
public enum OvhPortabilityCountryEnum {
	belgium("belgium"),
	france("france"),
	switzerland("switzerland");

	final String value;

	OvhPortabilityCountryEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
