package net.minidev.ovh.api.vps;

/**
 * All states a VPS can be in
 */
public enum OvhVpsStateEnum {
	installing("installing"),
	maintenance("maintenance"),
	rebooting("rebooting"),
	running("running"),
	stopped("stopped"),
	stopping("stopping"),
	upgrading("upgrading");

	final String value;

	OvhVpsStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
