package net.minidev.ovh.api.dedicatedcloud;

/**
 * All states a Dedicated Cloud two factor authentication whitelist can be in
 */
public enum OvhTwoFAWhitelistStateEnum {
	enabled("enabled"),
	enabling("enabling"),
	error("error"),
	migrating("migrating"),
	removed("removed"),
	removing("removing");

	final String value;

	OvhTwoFAWhitelistStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
