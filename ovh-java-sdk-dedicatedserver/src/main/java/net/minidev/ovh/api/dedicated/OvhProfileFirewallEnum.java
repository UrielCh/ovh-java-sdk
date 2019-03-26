package net.minidev.ovh.api.dedicated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * profile firewall asa
 */
public enum OvhProfileFirewallEnum {
	@JsonProperty("cisco.asa5505")
	cisco_asa5505("cisco.asa5505"),
	@JsonProperty("cisco.asa5510")
	cisco_asa5510("cisco.asa5510"),
	@JsonProperty("cisco.asa5520")
	cisco_asa5520("cisco.asa5520");

	final String value;

	OvhProfileFirewallEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
