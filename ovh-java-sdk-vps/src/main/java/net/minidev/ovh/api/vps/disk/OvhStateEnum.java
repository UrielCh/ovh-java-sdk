package net.minidev.ovh.api.vps.disk;

/**
 * Possible states the disk can be in
 */
public enum OvhStateEnum {
	connected("connected"),
	disconnected("disconnected"),
	pending("pending");

	final String value;

	OvhStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
