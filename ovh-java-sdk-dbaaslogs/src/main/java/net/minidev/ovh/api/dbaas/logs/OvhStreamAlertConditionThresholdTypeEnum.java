package net.minidev.ovh.api.dbaas.logs;

/**
 * Possible values for StreamAlertConditionThresholdTypeEnum
 */
public enum OvhStreamAlertConditionThresholdTypeEnum {
	MORE("MORE"),
	LESS("LESS"),
	LOWER("LOWER"),
	HIGHER("HIGHER");

	final String value;

	OvhStreamAlertConditionThresholdTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
