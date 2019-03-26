package net.minidev.ovh.api.dedicatedcloud.disasterrecovery;

/**
 * Site manager configured mode
 */
public enum OvhSiteRoleEnum {
	primary("primary"),
	secondary("secondary"),
	single("single");

	final String value;

	OvhSiteRoleEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
