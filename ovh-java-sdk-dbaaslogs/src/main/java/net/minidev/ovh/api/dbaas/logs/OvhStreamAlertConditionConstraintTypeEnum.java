package net.minidev.ovh.api.dbaas.logs;

/**
 * Possible values for StreamAlertConditionConstraintTypeEnum
 */
public enum OvhStreamAlertConditionConstraintTypeEnum {
	MEAN("MEAN"),
	MIN("MIN"),
	MAX("MAX"),
	SUM("SUM"),
	STDDEV("STDDEV");

	final String value;

	OvhStreamAlertConditionConstraintTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
