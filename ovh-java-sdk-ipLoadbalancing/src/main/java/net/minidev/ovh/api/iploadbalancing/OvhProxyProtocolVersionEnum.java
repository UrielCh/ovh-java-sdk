package net.minidev.ovh.api.iploadbalancing;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Possible values for proxy type
 */
public enum OvhProxyProtocolVersionEnum {
	v1("v1"),
	v2("v2"),
	@JsonProperty("v2-ssl")
	v2_ssl("v2-ssl"),
	@JsonProperty("v2-ssl-cn")
	v2_ssl_cn("v2-ssl-cn");

	final String value;

	OvhProxyProtocolVersionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
