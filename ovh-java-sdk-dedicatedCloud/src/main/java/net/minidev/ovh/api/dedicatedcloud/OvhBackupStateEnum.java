package net.minidev.ovh.api.dedicatedcloud;

/**
 * All states a Dedicated Cloud Backup can be in
 */
public enum OvhBackupStateEnum {
	disabled("disabled"),
	disabling("disabling"),
	enabled("enabled"),
	enabling("enabling"),
	error("error"),
	removing("removing");

	final String value;

	OvhBackupStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
