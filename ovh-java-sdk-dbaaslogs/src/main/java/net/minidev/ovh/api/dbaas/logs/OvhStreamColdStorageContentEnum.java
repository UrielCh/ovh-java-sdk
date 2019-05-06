package net.minidev.ovh.api.dbaas.logs;

/**
 * Possible values for StreamColdStorageContentEnum
 */
public enum OvhStreamColdStorageContentEnum {
	ALL("ALL"),
	GELF("GELF"),
	PLAIN("PLAIN");

	final String value;

	OvhStreamColdStorageContentEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
