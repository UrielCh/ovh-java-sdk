package net.minidev.ovh.api.ip;

/**
 * Possible values for IP state
 */
public enum OvhArpStateEnum {
	blocked("blocked"),
	unblocking("unblocking");

	final String value;

	OvhArpStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
