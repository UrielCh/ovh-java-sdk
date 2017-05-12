package net.minidev.ovh.api.dbaas.logs;

/**
 * Possible values for StreamAlertConditionConditionTypeEnum
 */
public enum OvhStreamAlertConditionConditionTypeEnum {
	MESSAGE_COUNT("MESSAGE_COUNT"),
	FIELD_VALUE("FIELD_VALUE"),
	FIELD_CONTENT_VALUE("FIELD_CONTENT_VALUE");

	final String value;

	OvhStreamAlertConditionConditionTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
