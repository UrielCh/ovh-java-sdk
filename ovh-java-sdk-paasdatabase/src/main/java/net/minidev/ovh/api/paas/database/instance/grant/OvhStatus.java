package net.minidev.ovh.api.paas.database.instance.grant;

/**
 * Grant status
 */
public enum OvhStatus {
	created("created"),
	creating("creating"),
	deleting("deleting"),
	updating("updating");

	final String value;

	OvhStatus(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
