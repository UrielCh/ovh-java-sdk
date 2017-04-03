package net.minidev.ovh.api.xdsl.eligibility;

/**
 * The providers
 */
public enum OvhProviderEnum {
	axione("axione"),
	ft("ft"),
	kosc("kosc"),
	ovh("ovh"),
	sfr("sfr");

	final String value;

	OvhProviderEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
