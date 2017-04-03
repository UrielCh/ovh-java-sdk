package net.minidev.ovh.api.dbaaslogs;

/**
 * Possible values for StreamRuleOperator
 */
public enum OvhStreamRuleOperator {
	MATCH_EXACTLY("MATCH_EXACTLY"),
	MATCH_REGULAR_EXPRESSION("MATCH_REGULAR_EXPRESSION"),
	GREATER_THAN("GREATER_THAN"),
	SMALLER_THAN("SMALLER_THAN"),
	FIELD_PRESENCE("FIELD_PRESENCE");

	final String value;

	OvhStreamRuleOperator(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
