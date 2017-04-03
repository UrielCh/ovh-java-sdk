package net.minidev.ovh.api.cloud.project;

/**
 * Possible values for project status
 */
public enum OvhProjectStatus {
	creating("creating"),
	deleted("deleted"),
	deleting("deleting"),
	ok("ok"),
	suspended("suspended");

	final String value;

	OvhProjectStatus(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
