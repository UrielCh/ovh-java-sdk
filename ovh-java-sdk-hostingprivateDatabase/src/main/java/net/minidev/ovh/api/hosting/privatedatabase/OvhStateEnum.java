package net.minidev.ovh.api.hosting.privatedatabase;

/**
 * Private database state
 */
public enum OvhStateEnum {
	detached("detached"),
	restartPending("restartPending"),
	startPending("startPending"),
	started("started"),
	stopPending("stopPending"),
	stopped("stopped");

	final String value;

	OvhStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
