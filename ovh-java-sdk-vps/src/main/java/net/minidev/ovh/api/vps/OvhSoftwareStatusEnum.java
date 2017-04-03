package net.minidev.ovh.api.vps;

/**
 * Available Status for a vps Software
 */
public enum OvhSoftwareStatusEnum {
	deprecated("deprecated"),
	stable("stable"),
	testing("testing");

	final String value;

	OvhSoftwareStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
