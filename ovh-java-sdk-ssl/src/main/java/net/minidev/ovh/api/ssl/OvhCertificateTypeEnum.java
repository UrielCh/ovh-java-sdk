package net.minidev.ovh.api.ssl;

/**
 * All type a SSL certificate can be
 */
public enum OvhCertificateTypeEnum {
	DV("DV"),
	EV("EV"),
	OV("OV");

	final String value;

	OvhCertificateTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
