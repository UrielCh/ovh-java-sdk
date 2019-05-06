package net.minidev.ovh.api.kube;

/**
 * Enum values for UpdatePolicy
 */
public enum OvhUpdatePolicy {
	ALWAYS_UPDATE("ALWAYS_UPDATE"),
	MINIMAL_DOWNTIME("MINIMAL_DOWNTIME"),
	NEVER_UPDATE("NEVER_UPDATE");

	final String value;

	OvhUpdatePolicy(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
