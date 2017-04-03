package net.minidev.ovh.api.cdnanycast;

/**
 * All Pop status
 */
public enum OvhPopStatusEnum {
	down("down"),
	ok("ok"),
	rerouted("rerouted"),
	unknown("unknown");

	final String value;

	OvhPopStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
