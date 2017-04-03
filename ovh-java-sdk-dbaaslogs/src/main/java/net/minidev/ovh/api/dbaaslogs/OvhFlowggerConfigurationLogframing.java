package net.minidev.ovh.api.dbaaslogs;

/**
 * Possible values for FlowggerConfigurationLogframing
 */
public enum OvhFlowggerConfigurationLogframing {
	LINE("LINE"),
	NUL("NUL"),
	SYSLEN("SYSLEN"),
	CAPNP("CAPNP");

	final String value;

	OvhFlowggerConfigurationLogframing(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
