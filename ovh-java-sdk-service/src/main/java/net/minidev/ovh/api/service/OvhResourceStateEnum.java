package net.minidev.ovh.api.service;

/**
 * Possible resource states
 */
public enum OvhResourceStateEnum {
	deleted("deleted"),
	deleting("deleting"),
	ok("ok"),
	opening("opening"),
	suspended("suspended"),
	suspending("suspending"),
	toDelete("toDelete"),
	toOpen("toOpen"),
	toSuspend("toSuspend");

	final String value;

	OvhResourceStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
