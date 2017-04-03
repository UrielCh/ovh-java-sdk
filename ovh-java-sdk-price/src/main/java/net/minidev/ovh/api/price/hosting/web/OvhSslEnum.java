package net.minidev.ovh.api.price.hosting.web;

/**
 * Enum of Ssls
 */
public enum OvhSslEnum {
	HOSTEDSSL("HOSTEDSSL");

	final String value;

	OvhSslEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
