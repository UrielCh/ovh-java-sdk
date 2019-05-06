package net.minidev.ovh.api.connectivity;

/**
 * Operator
 */
public enum OvhOperatorEnum {
	OVH("OVH"),
	KOSC("KOSC"),
	SFR("SFR"),
	ORANGE("ORANGE"),
	AXIONE("AXIONE");

	final String value;

	OvhOperatorEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
