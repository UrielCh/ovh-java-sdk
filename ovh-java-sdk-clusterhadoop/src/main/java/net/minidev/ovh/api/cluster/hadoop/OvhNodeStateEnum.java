package net.minidev.ovh.api.cluster.hadoop;

/**
 * All states a Hadoop Cluster Node can be in
 */
public enum OvhNodeStateEnum {
	available("available"),
	delivered("delivered"),
	toDeploy("toDeploy"),
	unavailable("unavailable");

	final String value;

	OvhNodeStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
