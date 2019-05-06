package net.minidev.ovh.api.email.domain;

import net.minidev.ovh.api.domain.OvhDomainFilterActionEnum;

/**
 * Filter List
 */
public class OvhFilter {
	/**
	 * Account name of filter
	 *
	 * canBeNull && readOnly
	 */
	public String pop;

	/**
	 * Domain name of filter
	 *
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * Filter name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Action of filter
	 *
	 * canBeNull && readOnly
	 */
	public OvhDomainFilterActionEnum action;

	/**
	 * If true filter is active
	 *
	 * canBeNull && readOnly
	 */
	public Boolean active;

	/**
	 * Priority of filter
	 *
	 * canBeNull && readOnly
	 */
	public Long priority;

	/**
	 * Action parameter of filter
	 *
	 * canBeNull && readOnly
	 */
	public String actionParam;
}
