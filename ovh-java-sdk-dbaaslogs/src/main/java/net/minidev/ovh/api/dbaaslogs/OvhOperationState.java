package net.minidev.ovh.api.dbaaslogs;

/**
 * Possible values for OperationState
 */
public enum OvhOperationState {
	PENDING("PENDING"),
	RECEIVED("RECEIVED"),
	STARTED("STARTED"),
	SUCCESS("SUCCESS"),
	FAILURE("FAILURE"),
	REVOKED("REVOKED"),
	RETRY("RETRY"),
	RUNNING("RUNNING");

	final String value;

	OvhOperationState(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
