package net.minidev.ovh.api.dedicated.housing;

/**
 * Distincts task
 */
public enum OvhTaskFunctionEnum {
	applyBackupFtpAcls("applyBackupFtpAcls"),
	applyBackupFtpQuota("applyBackupFtpQuota"),
	changePasswordBackupFTP("changePasswordBackupFTP"),
	createBackupFTP("createBackupFTP"),
	migrateBackupFTP("migrateBackupFTP"),
	removeBackupFTP("removeBackupFTP");

	final String value;

	OvhTaskFunctionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
