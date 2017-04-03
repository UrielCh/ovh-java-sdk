package net.minidev.ovh.api.dedicated.server;

/**
 * All states a dedicated server option can be in
 */
public enum OvhOptionStateEnum {
	released("released"),
	subscribed("subscribed");

	final String value;

	OvhOptionStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
