package net.minidev.ovh.api.reseller;

/**
 * Possible values for snapshot type
 */
public enum OvhSnapshotTypeEnum {
	automatic("automatic"),
	manual("manual");

	final String value;

	OvhSnapshotTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
