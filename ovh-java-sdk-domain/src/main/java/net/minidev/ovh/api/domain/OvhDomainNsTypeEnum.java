package net.minidev.ovh.api.domain;

/**
 * DomainNS Type
 */
public enum OvhDomainNsTypeEnum {
	external("external"),
	hosted("hosted");

	final String value;

	OvhDomainNsTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
