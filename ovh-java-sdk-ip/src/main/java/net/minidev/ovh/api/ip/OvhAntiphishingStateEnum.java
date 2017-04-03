package net.minidev.ovh.api.ip;

/**
 * Possible values for antiphishing state
 */
public enum OvhAntiphishingStateEnum {
	blocked("blocked"),
	blocking("blocking"),
	unblocked("unblocked"),
	unblocking("unblocking");

	final String value;

	OvhAntiphishingStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
