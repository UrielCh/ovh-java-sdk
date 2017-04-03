package net.minidev.ovh.api.license;

/**
 * All antivirus available for Plesk products
 */
public enum OvhOrderableAntivirusEnum {
	DR_WEB("DR_WEB"),
	KASPERSKY_UNLIMITED_MAILBOXES("KASPERSKY_UNLIMITED_MAILBOXES");

	final String value;

	OvhOrderableAntivirusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
