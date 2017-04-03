package net.minidev.ovh.api.dedicated.server;

/**
 * Different backup storage type
 */
public enum OvhBackupStorageTypeEnum {
	included("included"),
	storage("storage");

	final String value;

	OvhBackupStorageTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
