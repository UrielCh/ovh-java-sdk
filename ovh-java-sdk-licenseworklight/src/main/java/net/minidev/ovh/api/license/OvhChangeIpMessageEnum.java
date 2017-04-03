package net.minidev.ovh.api.license;

/**
 * Messages from change IP
 */
public enum OvhChangeIpMessageEnum {
	OK("OK"),
	destinationNotAllowed("destinationNotAllowed"),
	licenseAlreadyExists("licenseAlreadyExists"),
	notAllowedToHandleThis("notAllowedToHandleThis"),
	notSameType("notSameType"),
	sameIp("sameIp"),
	versionNotAllowed("versionNotAllowed");

	final String value;

	OvhChangeIpMessageEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
