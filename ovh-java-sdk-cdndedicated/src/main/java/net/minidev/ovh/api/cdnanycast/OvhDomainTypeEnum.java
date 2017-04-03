package net.minidev.ovh.api.cdnanycast;

/**
 * All type of Domain
 */
public enum OvhDomainTypeEnum {
	plain("plain"),
	ssl("ssl");

	final String value;

	OvhDomainTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
