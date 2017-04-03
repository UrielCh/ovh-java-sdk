package net.minidev.ovh.api.dbaaslogs;

/**
 * Possible values for StreamAlertConditionThresholdtype
 */
public enum OvhStreamAlertConditionThresholdtype {
	MORE("MORE"),
	LESS("LESS"),
	LOWER("LOWER"),
	HIGHER("HIGHER");

	final String value;

	OvhStreamAlertConditionThresholdtype(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
