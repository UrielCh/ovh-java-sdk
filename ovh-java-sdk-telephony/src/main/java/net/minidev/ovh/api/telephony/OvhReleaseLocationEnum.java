package net.minidev.ovh.api.telephony;

/**
 * Release location type : forward if the calling hangup, backward if the caller hangup, else local
 */
public enum OvhReleaseLocationEnum {
	backward("backward"),
	forward("forward"),
	local("local");

	final String value;

	OvhReleaseLocationEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
