package net.minidev.ovh.api.iploadbalancing;

/**
 * Match rule to combine to build routes
 */
public class OvhRouteRule {
	/**
	 * Name of the field to match like "protocol" or "host". See "/ipLoadbalancing/{serviceName}/route/availableRules" for a list of available rules
	 *
	 * canBeNull
	 */
	public String field;

	/**
	 * Invert the matching operator effect
	 *
	 * canBeNull
	 */
	public Boolean negate;

	/**
	 * Matching operator. Not all operators are available for all fields. See "/availableRules"
	 *
	 * canBeNull
	 */
	public OvhRouteRuleMatchesEnum match;

	/**
	 * Value to match against this match. Interpretation if this field depends on the match and field
	 *
	 * canBeNull
	 */
	public String pattern;

	/**
	 * Id of your rule
	 *
	 * canBeNull
	 */
	public Long ruleId;

	/**
	 * Name of sub-field, if applicable. This may be a Cookie or Header name for instance
	 *
	 * canBeNull
	 */
	public String subField;
}
