package net.minidev.ovh.api.billing;

/**
 * State of you paypal account
 */
public enum OvhPaypalStateEnum {
	tooManyFailures("tooManyFailures"),
	valid("valid");

	final String value;

	OvhPaypalStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
