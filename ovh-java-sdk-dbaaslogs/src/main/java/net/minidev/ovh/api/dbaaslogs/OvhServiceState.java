package net.minidev.ovh.api.dbaaslogs;

/**
 * Possible values for ServiceState
 */
public enum OvhServiceState {
	INIT("INIT"),
	ENABLED("ENABLED"),
	DISABLED("DISABLED");

	final String value;

	OvhServiceState(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
