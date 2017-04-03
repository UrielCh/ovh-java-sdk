package net.minidev.ovh.api.cluster.hadoop;

/**
 * All states a Hadoop Cluster can be in
 */
public enum OvhClusterStateEnum {
	created("created"),
	creating("creating"),
	deleted("deleted"),
	deleting("deleting"),
	delivered("delivered"),
	delivering("delivering"),
	toDeliver("toDeliver");

	final String value;

	OvhClusterStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
