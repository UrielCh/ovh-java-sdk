package net.minidev.ovh.api.vps;

/**
 * Available AutomatedBackup states
 */
public enum OvhBackupStateEnum {
	disabled("disabled"),
	enabled("enabled");

	final String value;

	OvhBackupStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
