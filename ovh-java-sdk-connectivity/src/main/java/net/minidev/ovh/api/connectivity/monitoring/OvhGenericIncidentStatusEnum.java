package net.minidev.ovh.api.connectivity.monitoring;

/**
 * Generic incident status
 */
public enum OvhGenericIncidentStatusEnum {
	detected("detected"),
	validated("validated"),
	closed("closed");

	final String value;

	OvhGenericIncidentStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
