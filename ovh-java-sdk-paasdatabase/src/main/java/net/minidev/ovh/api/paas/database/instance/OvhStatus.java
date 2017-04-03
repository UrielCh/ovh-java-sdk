package net.minidev.ovh.api.paas.database.instance;

/**
 * Instance status
 */
public enum OvhStatus {
	creating("creating"),
	deleting("deleting"),
	reopening("reopening"),
	resizing("resizing"),
	restarting("restarting"),
	running("running"),
	starting("starting"),
	stopped("stopped"),
	stopping("stopping"),
	suspended("suspended"),
	suspending("suspending"),
	updating("updating"),
	upgrading("upgrading");

	final String value;

	OvhStatus(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
