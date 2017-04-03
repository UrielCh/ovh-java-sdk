package net.minidev.ovh.api.dbaaslogs;

/**
 * Possible values for FlowggerConfigurationLogformat
 */
public enum OvhFlowggerConfigurationLogformat {
	RFC5424("RFC5424"),
	LTSV("LTSV"),
	GELF("GELF"),
	CAPNP("CAPNP");

	final String value;

	OvhFlowggerConfigurationLogformat(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
