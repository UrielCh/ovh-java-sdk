package net.minidev.ovh.api.dbaas.logs;

/**
 * Possible values for FlowggerConfigurationTypeEnum
 */
public enum OvhFlowggerConfigurationTypeEnum {
	TLS("TLS"),
	TLS_CO("TLS_CO");

	final String value;

	OvhFlowggerConfigurationTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
