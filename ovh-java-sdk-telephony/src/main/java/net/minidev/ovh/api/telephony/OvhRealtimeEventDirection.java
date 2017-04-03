package net.minidev.ovh.api.telephony;

/**
 * The call direction for a given event
 */
public enum OvhRealtimeEventDirection {
	incoming("incoming"),
	outgoing("outgoing");

	final String value;

	OvhRealtimeEventDirection(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
