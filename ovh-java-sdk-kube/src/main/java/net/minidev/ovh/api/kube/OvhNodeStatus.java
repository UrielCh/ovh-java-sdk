package net.minidev.ovh.api.kube;

/**
 * Enum values for Status
 */
public enum OvhNodeStatus {
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
	USER_NODE_NOT_FOUND_ERROR("USER_NODE_NOT_FOUND_ERROR"),
	USER_NODE_SUSPENDED_SERVICE("USER_NODE_SUSPENDED_SERVICE"),
	READY("READY");

	final String value;

	OvhNodeStatus(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
