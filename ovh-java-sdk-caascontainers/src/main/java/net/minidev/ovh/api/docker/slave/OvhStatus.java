package net.minidev.ovh.api.docker.slave;

/**
 * The state of the slave
 */
public enum OvhStatus {
	blocked("blocked"),
	created("created"),
	creating("creating");

	final String value;

	OvhStatus(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
