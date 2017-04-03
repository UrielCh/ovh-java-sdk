package net.minidev.ovh.api.dbaaslogs;

/**
 * Possible values for NewStreamAlertConditionConditiontype
 */
public enum OvhNewStreamAlertConditionConditiontype {
	MESSAGE_COUNT("MESSAGE_COUNT"),
	FIELD_VALUE("FIELD_VALUE"),
	FIELD_CONTENT_VALUE("FIELD_CONTENT_VALUE");

	final String value;

	OvhNewStreamAlertConditionConditiontype(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
