package net.minidev.ovh.api.nichandle;

import net.minidev.ovh.api.nichandle.accessrestriction.OvhIpRestrictionRuleEnum;

/**
 * IP Restriction default rule
 */
public class OvhIpRestrictionDefaultRule {
	/**
	 * Accept or deny access
	 *
	 * canBeNull && readOnly
	 */
	public OvhIpRestrictionRuleEnum rule;

	/**
	 * Send an email if someone try to access
	 *
	 * canBeNull && readOnly
	 */
	public Boolean warning;
}
