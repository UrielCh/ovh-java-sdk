package net.minidev.ovh.api.telephony;

/**
 * The event protocol
 */
public enum OvhRealtimeEventProtocol {
	mgcp("mgcp"),
	sip("sip");

	final String value;

	OvhRealtimeEventProtocol(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
