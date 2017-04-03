package net.minidev.ovh.api.ip;

/**
 * Possible values for spam state
 */
public enum OvhSpamStateEnum {
	blockedForSpam("blockedForSpam"),
	unblocked("unblocked"),
	unblocking("unblocking");

	final String value;

	OvhSpamStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
