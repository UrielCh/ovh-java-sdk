package net.minidev.ovh.api.ip;

/**
 * Possible values for ssl state
 */
public enum OvhLoadBalancingSslEnum {
	customer("customer"),
	none("none"),
	ovh("ovh");

	final String value;

	OvhLoadBalancingSslEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
