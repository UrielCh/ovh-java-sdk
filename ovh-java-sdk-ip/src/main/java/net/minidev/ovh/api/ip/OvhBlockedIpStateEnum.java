package net.minidev.ovh.api.ip;

/**
 * Possible values for IP state
 */
public enum OvhBlockedIpStateEnum {
	blocked("blocked"),
	unblocking("unblocking");

	final String value;

	OvhBlockedIpStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
