package net.minidev.ovh.api.hosting.web.freedom;

/**
 * Available status for freedoms
 */
public enum OvhStatusEnum {
	blockedByCustomer("blockedByCustomer"),
	blockedBySystem("blockedBySystem"),
	ok("ok"),
	preset("preset");

	final String value;

	OvhStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
