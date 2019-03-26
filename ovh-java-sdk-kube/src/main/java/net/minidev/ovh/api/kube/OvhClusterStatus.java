package net.minidev.ovh.api.kube;

/**
 * Enum values for Status
 */
public enum OvhClusterStatus {
	INSTALLING("INSTALLING"),
	UPDATING("UPDATING"),
	RESETTING("RESETTING"),
	SUSPENDING("SUSPENDING"),
	REOPENING("REOPENING"),
	DELETING("DELETING"),
	SUSPENDED("SUSPENDED"),
	ERROR("ERROR"),
	USER_ERROR("USER_ERROR"),
	USER_QUOTA_ERROR("USER_QUOTA_ERROR"),
	READY("READY");

	final String value;

	OvhClusterStatus(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
