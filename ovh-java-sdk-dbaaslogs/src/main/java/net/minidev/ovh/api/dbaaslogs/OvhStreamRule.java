package net.minidev.ovh.api.dbaaslogs;

/**
 * Stream rule
 */
public class OvhStreamRule {
	/**
	 * Field name
	 *
	 * canBeNull && readOnly
	 */
	public String field;

	/**
	 * Stream rule UUID
	 *
	 * canBeNull && readOnly
	 */
	public String ruleId;

	/**
	 * Field value
	 *
	 * canBeNull && readOnly
	 */
	public String value;

	/**
	 * Field operator
	 *
	 * canBeNull && readOnly
	 */
	public OvhStreamRuleOperator operator;

	/**
	 * Invert condition
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isInverted;
}
