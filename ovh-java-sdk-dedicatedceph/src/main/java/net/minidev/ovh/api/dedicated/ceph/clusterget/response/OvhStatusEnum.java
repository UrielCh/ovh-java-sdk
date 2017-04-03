package net.minidev.ovh.api.dedicated.ceph.clusterget.response;

/**
 * Status of cluster
 */
public enum OvhStatusEnum {
	CREATING("CREATING"),
	INSTALLED("INSTALLED"),
	DELETING("DELETING"),
	DELETED("DELETED"),
	TASK_IN_PROGRESS("TASK_IN_PROGRESS");

	final String value;

	OvhStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
