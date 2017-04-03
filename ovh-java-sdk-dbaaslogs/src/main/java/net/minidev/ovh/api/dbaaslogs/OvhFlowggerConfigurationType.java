package net.minidev.ovh.api.dbaaslogs;

/**
 * Possible values for FlowggerConfigurationType
 */
public enum OvhFlowggerConfigurationType {
	TLS("TLS"),
	TLS_CO("TLS_CO");

	final String value;

	OvhFlowggerConfigurationType(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
