package net.minidev.ovh.api.router;

/**
 * All states this object can be in
 */
public enum OvhStatusEnum {
	creating("creating"),
	error("error"),
	off("off"),
	on("on"),
	removing("removing"),
	suspended("suspended");

	final String value;

	OvhStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
