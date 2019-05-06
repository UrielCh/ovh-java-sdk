package net.minidev.ovh.api.dbaas.logs;

/**
 * Possible values for StreamColdStorageTargetEnum
 */
public enum OvhStreamColdStorageTargetEnum {
	PCA("PCA"),
	PCS("PCS");

	final String value;

	OvhStreamColdStorageTargetEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
