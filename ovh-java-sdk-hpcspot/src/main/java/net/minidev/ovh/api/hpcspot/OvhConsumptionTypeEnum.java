package net.minidev.ovh.api.hpcspot;

/**
 * All types a HPC Spot consumption can be in
 */
public enum OvhConsumptionTypeEnum {
	job("job"),
	reservation("reservation"),
	session("session");

	final String value;

	OvhConsumptionTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
