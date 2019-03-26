package net.minidev.ovh.api.iploadbalancing.routerule;

import net.minidev.ovh.api.iploadbalancing.OvhRouteRuleMatchesEnum;

/**
 * Rule of a route
 */
public class OvhRouteRule {
	/**
	 * Name of the field to match like "protocol" or "host". See "/ipLoadbalancing/{serviceName}/availableRouteRules" for a list of available rules
	 *
	 * canBeNull && readOnly
	 */
	public String field;

	/**
	 * Human readable name for your rule
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

	/**
	 * Invert the matching operator effect
	 *
	 * canBeNull && readOnly
	 */
	public Boolean negate;

	/**
	 * Value to match against this match. Interpretation if this field depends on the match and field
	 *
	 * canBeNull && readOnly
	 */
	public String pattern;

	/**
	 * Matching operator. Not all operators are available for all fields. See "/ipLoadbalancing/{serviceName}/availableRouteRules"
	 *
	 * canBeNull && readOnly
	 */
	public OvhRouteRuleMatchesEnum match;

	/**
	 * Id of your rule
	 *
	 * canBeNull && readOnly
	 */
	public Long ruleId;

	/**
	 * Name of sub-field, if applicable. This may be a Cookie or Header name for instance
	 *
	 * canBeNull && readOnly
	 */
	public String subField;
}
