package net.minidev.ovh.api.vps.ip;

/**
 * Possible states of a service (ping, port)
 */
public enum OvhServiceStatusStateEnum {
	down("down"),
	up("up");

	final String value;

	OvhServiceStatusStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
