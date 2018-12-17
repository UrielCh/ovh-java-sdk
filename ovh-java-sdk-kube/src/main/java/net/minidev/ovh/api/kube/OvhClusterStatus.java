package net.minidev.ovh.api.kube;

/**
 * Enum values for Status
 */
public enum OvhClusterStatus {
	INSTALLING("INSTALLING"),
	DELETING("DELETING"),
	ERROR("ERROR"),
	READY("READY");

	final String value;

	OvhClusterStatus(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
