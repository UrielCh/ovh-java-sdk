package net.minidev.ovh.api.license;

/**
 * All antispam available for Plesk products
 */
public enum OvhOrderableAntispamEnum {
	SPAM_ASSASSIN("SPAM_ASSASSIN");

	final String value;

	OvhOrderableAntispamEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
