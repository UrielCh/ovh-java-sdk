package net.minidev.ovh.api.dbaas.logs;

/**
 * Possible values for FlowggerConfigurationLogFormatEnum
 */
public enum OvhFlowggerConfigurationLogFormatEnum {
	RFC5424("RFC5424"),
	LTSV("LTSV"),
	GELF("GELF"),
	CAPNP("CAPNP");

	final String value;

	OvhFlowggerConfigurationLogFormatEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
