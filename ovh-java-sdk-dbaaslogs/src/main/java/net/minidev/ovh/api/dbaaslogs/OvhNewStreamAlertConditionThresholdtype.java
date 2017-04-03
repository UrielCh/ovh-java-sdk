package net.minidev.ovh.api.dbaaslogs;

/**
 * Possible values for NewStreamAlertConditionThresholdtype
 */
public enum OvhNewStreamAlertConditionThresholdtype {
	MORE("MORE"),
	LESS("LESS"),
	LOWER("LOWER"),
	HIGHER("HIGHER");

	final String value;

	OvhNewStreamAlertConditionThresholdtype(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
