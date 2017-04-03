package net.minidev.ovh.api.price.email;

/**
 * Enum of Services
 */
public enum OvhServiceEnum {
	big("big"),
	classic("classic"),
	medium("medium");

	final String value;

	OvhServiceEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
