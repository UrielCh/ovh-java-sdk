package net.minidev.ovh.api.dedicated.storage;

/**
 * Sync values
 */
public enum OvhSyncEnum {
	always("always"),
	disabled("disabled"),
	standard("standard");

	final String value;

	OvhSyncEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
