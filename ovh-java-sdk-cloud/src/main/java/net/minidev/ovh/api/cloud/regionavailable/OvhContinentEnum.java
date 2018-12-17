package net.minidev.ovh.api.cloud.regionavailable;

/**
 * ContinentEnum
 */
public enum OvhContinentEnum {
	CA("CA"),
	EU("EU"),
	ASIA("ASIA"),
	US("US");

	final String value;

	OvhContinentEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
