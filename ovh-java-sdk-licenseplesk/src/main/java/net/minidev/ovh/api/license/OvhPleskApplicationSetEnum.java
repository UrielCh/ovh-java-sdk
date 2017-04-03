package net.minidev.ovh.api.license;

/**
 * Application set available for Plesk products
 */
public enum OvhPleskApplicationSetEnum {
	applicationpack("applicationpack"),
	developerpack("developerpack"),
	powerpack("powerpack");

	final String value;

	OvhPleskApplicationSetEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
