package net.minidev.ovh.api.email.exchange;

/**
 * OVH licence account
 */
public enum OvhOvhLicenceEnum {
	basic("basic"),
	enterprise("enterprise"),
	standard("standard");

	final String value;

	OvhOvhLicenceEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
