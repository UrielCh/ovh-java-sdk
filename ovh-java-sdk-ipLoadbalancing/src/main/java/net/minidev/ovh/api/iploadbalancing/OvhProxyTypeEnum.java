package net.minidev.ovh.api.iploadbalancing;

/**
 * Possible values for proxy type
 */
public enum OvhProxyTypeEnum {
	http("http"),
	tcp("tcp");

	final String value;

	OvhProxyTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
