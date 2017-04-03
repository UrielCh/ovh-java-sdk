package net.minidev.ovh.api.email.exchange;

/**
 * Activesync action
 */
public enum OvhActiveSyncPolicyEnum {
	allow("allow"),
	block("block"),
	quarantine("quarantine");

	final String value;

	OvhActiveSyncPolicyEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
