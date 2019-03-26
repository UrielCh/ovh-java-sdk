package net.minidev.ovh.api.iploadbalancing;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Match rule to combine to build routes
 */
public class OvhRouteAvailableRule {
	/**
	 * Rule name
	 *
	 * canBeNull
	 */
	public String name;

	/**
	 * Expected type for the pattern. Like "enum", "backend", "cidr", ...
	 *
	 * canBeNull
	 */
	public String pattern;

	/**
	 * Protocol supported by this action
	 *
	 * canBeNull
	 */
	public String type;

	/**
	 * List of match operators compatible with this rule
	 *
	 * canBeNull
	 */
	public String[] matches;

	/**
	 * If pattern is "enum", list of available options
	 *
	 * canBeNull
	 */
	@JsonProperty("enum")
	public String[] _enum;

	/**
	 * If true, this rule needs a subfield. Typically a cookie or header name
	 *
	 * canBeNull
	 */
	public Boolean hasSubField;
}
