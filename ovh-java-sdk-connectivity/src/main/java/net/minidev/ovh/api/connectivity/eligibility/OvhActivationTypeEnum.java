package net.minidev.ovh.api.connectivity.eligibility;

/**
 * Activation type, for copper only
 */
public enum OvhActivationTypeEnum {
	activate("activate"),
	create("create"),
	createNeighbour("createNeighbour");

	final String value;

	OvhActivationTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
