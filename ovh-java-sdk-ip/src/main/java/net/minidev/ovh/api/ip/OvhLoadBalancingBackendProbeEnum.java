package net.minidev.ovh.api.ip;

/**
 * Possible values for your IP load balancing backend probe
 */
public enum OvhLoadBalancingBackendProbeEnum {
	http("http"),
	icmp("icmp"),
	none("none"),
	oco("oco");

	final String value;

	OvhLoadBalancingBackendProbeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
