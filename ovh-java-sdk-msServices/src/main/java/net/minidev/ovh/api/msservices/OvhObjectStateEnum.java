package net.minidev.ovh.api.msservices;

/**
 * Current object state
 */
public enum OvhObjectStateEnum {
	creating("creating"),
	deleting("deleting"),
	modifying("modifying"),
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
