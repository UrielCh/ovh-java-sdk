package net.minidev.ovh.api.dbaaslogs;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Possible values for FlowggerConfigurationTlsmethod
 */
public enum OvhFlowggerConfigurationTlsmethod {
	ANY("ANY"),
	@JsonProperty("TLS_V_1.0")
	TLS_V_1_0("TLS_V_1.0"),
	@JsonProperty("TLS_V_1.1")
	TLS_V_1_1("TLS_V_1.1"),
	@JsonProperty("TLS_V_1.2")
	TLS_V_1_2("TLS_V_1.2");

	final String value;

	OvhFlowggerConfigurationTlsmethod(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
