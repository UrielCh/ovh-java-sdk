package net.minidev.ovh.api.ssl;

/**
 * All authority a SSL certificate can be issued from
 */
public enum OvhCertificateAuthorityEnum {
	comodo("comodo");

	final String value;

	OvhCertificateAuthorityEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
