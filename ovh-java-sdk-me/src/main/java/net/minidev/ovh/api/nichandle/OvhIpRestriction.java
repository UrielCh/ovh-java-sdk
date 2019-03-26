package net.minidev.ovh.api.nichandle;

import net.minidev.ovh.api.nichandle.accessrestriction.OvhIpRestrictionRuleEnum;

/**
 * List of all IP Restrictions
 */
public class OvhIpRestriction {
	/**
	 * An IP range where we will apply the rule
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * Send an email if someone try to access with this IP address
	 *
	 * canBeNull && readOnly
	 */
	public Boolean warning;

	/**
	 * Accept or deny IP access
	 *
	 * canBeNull && readOnly
	 */
	public OvhIpRestrictionRuleEnum rule;

	/**
	 * The Id of the restriction
	 *
	 * canBeNull && readOnly
	 */
	public Long id;
}
