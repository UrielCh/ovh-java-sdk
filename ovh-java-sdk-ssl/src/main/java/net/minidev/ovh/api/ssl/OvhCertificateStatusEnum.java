package net.minidev.ovh.api.ssl;

/**
 * All status a SSL certificate can be in
 */
public enum OvhCertificateStatusEnum {
	creating("creating"),
	error("error"),
	ok("ok"),
	validating("validating");

	final String value;

	OvhCertificateStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
