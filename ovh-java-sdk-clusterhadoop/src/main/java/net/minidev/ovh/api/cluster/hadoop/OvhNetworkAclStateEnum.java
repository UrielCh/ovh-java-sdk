package net.minidev.ovh.api.cluster.hadoop;

/**
 * All states a Hadoop Cluster NetworkAcl can be in
 */
public enum OvhNetworkAclStateEnum {
	disabled("disabled"),
	enabled("enabled"),
	pending("pending");

	final String value;

	OvhNetworkAclStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
