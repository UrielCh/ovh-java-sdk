package net.minidev.ovh.api.dbaas.logs;

/**
 * Possible values for StreamRuleOperatorEnum
 */
public enum OvhStreamRuleOperatorEnum {
	MATCH_EXACTLY("MATCH_EXACTLY"),
	MATCH_REGULAR_EXPRESSION("MATCH_REGULAR_EXPRESSION"),
	GREATER_THAN("GREATER_THAN"),
	SMALLER_THAN("SMALLER_THAN"),
	FIELD_PRESENCE("FIELD_PRESENCE");

	final String value;

	OvhStreamRuleOperatorEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
