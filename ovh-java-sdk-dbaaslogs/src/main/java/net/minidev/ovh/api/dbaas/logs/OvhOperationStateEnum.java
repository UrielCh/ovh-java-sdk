package net.minidev.ovh.api.dbaas.logs;

/**
 * Possible values for OperationStateEnum
 */
public enum OvhOperationStateEnum {
	PENDING("PENDING"),
	RECEIVED("RECEIVED"),
	STARTED("STARTED"),
	SUCCESS("SUCCESS"),
	FAILURE("FAILURE"),
	REVOKED("REVOKED"),
	RETRY("RETRY"),
	RUNNING("RUNNING");

	final String value;

	OvhOperationStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
