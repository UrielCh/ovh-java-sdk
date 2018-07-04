package net.minidev.ovh.api.dedicatedcloud.optionaccessnetwork;

/**
 * States of a Private Cloud option
 */
public enum OvhStateEnum {
	creating("creating"),
	deleting("deleting"),
	delivered("delivered"),
	error("error"),
	toCreate("toCreate"),
	toDelete("toDelete"),
	toUpdate("toUpdate"),
	unknown("unknown"),
	updating("updating");

	final String value;

	OvhStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
