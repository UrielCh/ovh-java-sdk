package net.minidev.ovh.api.dbaaslogs;

/**
 * Possible values for StreamAlertConditionConstrainttype
 */
public enum OvhStreamAlertConditionConstrainttype {
	MEAN("MEAN"),
	MIN("MIN"),
	MAX("MAX"),
	SUM("SUM"),
	STDDEV("STDDEV");

	final String value;

	OvhStreamAlertConditionConstrainttype(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
