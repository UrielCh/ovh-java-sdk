package net.minidev.ovh.api.email.exchange;

/**
 * Current object state
 */
public enum OvhObjectStateEnum {
	creating("creating"),
	deleting("deleting"),
	ok("ok"),
	reopening("reopening"),
	suspended("suspended"),
	suspending("suspending");

	final String value;

	OvhObjectStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
