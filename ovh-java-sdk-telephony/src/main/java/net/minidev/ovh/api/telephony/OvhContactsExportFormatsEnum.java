package net.minidev.ovh.api.telephony;

/**
 * Export file format
 */
public enum OvhContactsExportFormatsEnum {
	csv("csv");

	final String value;

	OvhContactsExportFormatsEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
