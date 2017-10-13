package net.minidev.ovh.api.dedicatedcloud.backup;

/**
 * All the type of a restore point
 */
public enum OvhBackupTypeEnum {
	full("full"),
	incremental("incremental");

	final String value;

	OvhBackupTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
