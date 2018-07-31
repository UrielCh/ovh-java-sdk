package net.minidev.ovh.api.dbaas.logs;

/**
 * Possible values for ClusterAllowedNetworkFlowTypeEnum
 */
public enum OvhClusterAllowedNetworkFlowTypeEnum {
	QUERY("QUERY"),
	DIRECT_INPUT("DIRECT_INPUT"),
	ALL("ALL");

	final String value;

	OvhClusterAllowedNetworkFlowTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
