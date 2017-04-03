package net.minidev.ovh.api.cdnanycast;

/**
 * All states a status can be in
 */
public enum OvhCacheRuleStatusEnum {
	creating("creating"),
	deleting("deleting"),
	error("error"),
	off("off"),
	on("on"),
	updating("updating");

	final String value;

	OvhCacheRuleStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
