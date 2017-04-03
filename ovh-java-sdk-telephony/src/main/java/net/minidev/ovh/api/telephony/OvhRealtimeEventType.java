package net.minidev.ovh.api.telephony;

/**
 * The event type
 */
public enum OvhRealtimeEventType {
	end_calling("end_calling"),
	end_hold("end_hold"),
	end_ringing("end_ringing"),
	start_calling("start_calling"),
	start_hold("start_hold"),
	start_ringing("start_ringing");

	final String value;

	OvhRealtimeEventType(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
