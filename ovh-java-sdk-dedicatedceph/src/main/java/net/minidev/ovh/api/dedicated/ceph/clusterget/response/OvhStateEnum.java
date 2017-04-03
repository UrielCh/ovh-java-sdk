package net.minidev.ovh.api.dedicated.ceph.clusterget.response;

/**
 * State of cluster
 */
public enum OvhStateEnum {
	ACTIVE("ACTIVE"),
	SUSPENDED("SUSPENDED");

	final String value;

	OvhStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
