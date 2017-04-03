package net.minidev.ovh.api.dedicatedcloud.backup;

/**
 * All the type of a restore point
 */
public enum OvhBackupTypeEnum {
	Full("Full"),
	Incremental("Incremental");

	final String value;

	OvhBackupTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
