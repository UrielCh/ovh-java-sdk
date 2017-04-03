package net.minidev.ovh.api.vps;

/**
 * All states a VPS task can be in
 */
public enum OvhTaskStateEnum {
	blocked("blocked"),
	cancelled("cancelled"),
	doing("doing"),
	done("done"),
	error("error"),
	paused("paused"),
	todo("todo"),
	waitingAck("waitingAck");

	final String value;

	OvhTaskStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
