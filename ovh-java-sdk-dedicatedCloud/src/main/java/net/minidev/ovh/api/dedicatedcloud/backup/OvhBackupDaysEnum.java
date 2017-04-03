package net.minidev.ovh.api.dedicatedcloud.backup;

/**
 * All the possible Days of Backup
 */
public enum OvhBackupDaysEnum {
	Friday("Friday"),
	Monday("Monday"),
	Saturday("Saturday"),
	Sunday("Sunday"),
	Thursday("Thursday"),
	Tuesday("Tuesday"),
	Wednesday("Wednesday");

	final String value;

	OvhBackupDaysEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
