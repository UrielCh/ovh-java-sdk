package net.minidev.ovh.api.cloud.volume;

/**
 * SnapshotStatusEnum
 */
public enum OvhSnapshotStatusEnum {
	creating("creating"),
	available("available"),
	deleting("deleting"),
	error("error"),
	error_deleting("error_deleting");

	final String value;

	OvhSnapshotStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
