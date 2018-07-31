package net.minidev.ovh.api.dbaas.logs;

/**
 * Possible values for StreamRuleOperatorEnum
 */
public enum OvhStreamRuleOperatorEnum {
	MATCH_EXACTLY("MATCH_EXACTLY"),
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
