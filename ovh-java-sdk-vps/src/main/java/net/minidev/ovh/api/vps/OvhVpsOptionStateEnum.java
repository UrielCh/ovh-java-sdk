package net.minidev.ovh.api.vps;

/**
 * All states a VPS Option can be in
 */
public enum OvhVpsOptionStateEnum {
	released("released"),
	subscribed("subscribed");

	final String value;

	OvhVpsOptionStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
