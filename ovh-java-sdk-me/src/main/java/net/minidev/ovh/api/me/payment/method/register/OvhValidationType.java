package net.minidev.ovh.api.me.payment.method.register;

/**
 * Register validation type enum
 */
public enum OvhValidationType {
	DONE("DONE"),
	REDIRECT("REDIRECT"),
	IFRAME_VANTIV("IFRAME_VANTIV");

	final String value;

	OvhValidationType(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
