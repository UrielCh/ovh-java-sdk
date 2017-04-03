package net.minidev.ovh.api.email.service;

/**
 * Email offer enum
 */
public enum OvhOfferEnum {
	big("big"),
	classic("classic"),
	medium("medium");

	final String value;

	OvhOfferEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
