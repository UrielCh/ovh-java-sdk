package net.minidev.ovh.api.dbaas.queue;

/**
 * AppStatus
 */
public enum OvhAppStatus {
	not_configured("not_configured"),
	active("active"),
	deleted("deleted");

	final String value;

	OvhAppStatus(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
