package net.minidev.ovh.api.telephony.portability;

/**
 * Country of number to port
 */
public enum OvhCountriesAvailable {
	belgium("belgium"),
	france("france"),
	switzerland("switzerland");

	final String value;

	OvhCountriesAvailable(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
