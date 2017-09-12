package net.minidev.ovh.api.dedicated.server.backup;

/**
 * Possible values for backup status code
 */
public enum OvhBackupStatusCodeEnum {
	DELETING("DELETING"),
	ERROR("ERROR"),
	OK("OK"),
	SUSPENDED("SUSPENDED"),
	SUSPENDING("SUSPENDING"),
	UNKNOWN("UNKNOWN"),
	WAITING_AGREEMENTS_VALIDATION("WAITING_AGREEMENTS_VALIDATION");

	final String value;

	OvhBackupStatusCodeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
