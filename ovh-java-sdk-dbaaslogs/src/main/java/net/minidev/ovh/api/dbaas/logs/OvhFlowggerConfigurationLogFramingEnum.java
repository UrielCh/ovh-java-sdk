package net.minidev.ovh.api.dbaas.logs;

/**
 * Possible values for FlowggerConfigurationLogFramingEnum
 */
public enum OvhFlowggerConfigurationLogFramingEnum {
	LINE("LINE"),
	NUL("NUL"),
	SYSLEN("SYSLEN"),
	CAPNP("CAPNP");

	final String value;

	OvhFlowggerConfigurationLogFramingEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
