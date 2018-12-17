package net.minidev.ovh.api.kube;

/**
 * Enum values for Status
 */
public enum OvhNodeStatus {
	INSTALLING("INSTALLING"),
	DELETING("DELETING"),
	ERROR("ERROR"),
	READY("READY");

	final String value;

	OvhNodeStatus(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
