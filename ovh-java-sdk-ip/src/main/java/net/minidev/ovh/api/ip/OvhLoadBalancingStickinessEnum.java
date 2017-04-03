package net.minidev.ovh.api.ip;

/**
 * Possible values for load balancing IP stickiness
 */
public enum OvhLoadBalancingStickinessEnum {
	cookie("cookie"),
	none("none"),
	sourceIp("sourceIp");

	final String value;

	OvhLoadBalancingStickinessEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
