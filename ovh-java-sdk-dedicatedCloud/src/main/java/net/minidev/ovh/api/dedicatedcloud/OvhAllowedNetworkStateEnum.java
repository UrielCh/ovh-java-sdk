package net.minidev.ovh.api.dedicatedcloud;

/**
 * All states an Allowed Network can be in
 */
public enum OvhAllowedNetworkStateEnum {
	allowed("allowed"),
	toDelete("toDelete"),
	toUpdate("toUpdate");

	final String value;

	OvhAllowedNetworkStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
