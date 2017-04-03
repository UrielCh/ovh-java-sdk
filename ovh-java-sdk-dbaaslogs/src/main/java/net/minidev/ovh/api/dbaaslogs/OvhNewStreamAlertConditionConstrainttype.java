package net.minidev.ovh.api.dbaaslogs;

/**
 * Possible values for NewStreamAlertConditionConstrainttype
 */
public enum OvhNewStreamAlertConditionConstrainttype {
	MEAN("MEAN"),
	MIN("MIN"),
	MAX("MAX"),
	SUM("SUM"),
	STDDEV("STDDEV");

	final String value;

	OvhNewStreamAlertConditionConstrainttype(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
