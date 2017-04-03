package net.minidev.ovh.api.billing;

/**
 * State of you credit card
 */
public enum OvhCreditCardStateEnum {
	expired("expired"),
	tooManyFailures("tooManyFailures"),
	valid("valid");

	final String value;

	OvhCreditCardStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
