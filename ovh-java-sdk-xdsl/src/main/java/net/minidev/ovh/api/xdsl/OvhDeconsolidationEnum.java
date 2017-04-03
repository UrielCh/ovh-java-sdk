package net.minidev.ovh.api.xdsl;

/**
 * Deconsolidation of the line.
 */
public enum OvhDeconsolidationEnum {
	createNeighbour("createNeighbour"),
	creation("creation"),
	partial("partial"),
	total("total");

	final String value;

	OvhDeconsolidationEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
