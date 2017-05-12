package net.minidev.ovh.api.iploadbalancing;

/**
 * List of possible method for HTTP probes. Consider using HEAD to save bandwidth when possible.
 */
public enum OvhProbeMethodEnum {
	GET("GET"),
	HEAD("HEAD"),
	OPTIONS("OPTIONS"),
	internal("internal");

	final String value;

	OvhProbeMethodEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
