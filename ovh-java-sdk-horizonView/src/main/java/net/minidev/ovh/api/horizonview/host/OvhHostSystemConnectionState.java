package net.minidev.ovh.api.horizonview.host;

/**
 * The connection state of the host
 */
public enum OvhHostSystemConnectionState {
	connected("connected"),
	disconnected("disconnected"),
	notResponding("notResponding");

	final String value;

	OvhHostSystemConnectionState(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
