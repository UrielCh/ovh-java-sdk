package net.minidev.ovh.api.telephony;

/**
 * The blocking mode of line calls
 */
public enum OvhLineBlockingMode {
	both("both"),
	incoming("incoming"),
	outgoing("outgoing");

	final String value;

	OvhLineBlockingMode(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
