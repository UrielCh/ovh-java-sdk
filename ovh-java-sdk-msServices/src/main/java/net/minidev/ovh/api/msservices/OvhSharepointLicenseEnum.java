package net.minidev.ovh.api.msservices;

/**
 * Sharepoint account license
 */
public enum OvhSharepointLicenseEnum {
	foundation("foundation"),
	standard("standard");

	final String value;

	OvhSharepointLicenseEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
