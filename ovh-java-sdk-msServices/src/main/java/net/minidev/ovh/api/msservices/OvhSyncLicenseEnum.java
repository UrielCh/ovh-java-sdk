package net.minidev.ovh.api.msservices;

/**
 * Sync account license
 */
public enum OvhSyncLicenseEnum {
	standard("standard"),
	standardFree("standardFree");

	final String value;

	OvhSyncLicenseEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
